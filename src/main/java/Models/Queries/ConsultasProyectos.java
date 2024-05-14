package Models.Queries;

import Models.Database.Conexion;
import Models.Tables.Proyectos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasProyectos {
    private Conexion cn;

    public ConsultasProyectos(Conexion conexion) {
        this.cn = conexion;
    }
    public ArrayList<Proyectos> ObtenerProyectos() throws SQLException {
        ArrayList<Proyectos> proyectos = new ArrayList<>();
        ResultSet resultadoConsulta = cn.EjecutarConsultas("SELECT * FROM Proyectos;");
        try {
            if (resultadoConsulta != null) {
                while (resultadoConsulta.next()) {
                    Proyectos proyecto = new Proyectos();
                    proyecto.setPK_idProyecto(resultadoConsulta.getInt("PK_idProyecto"));
                    proyecto.setNombreProyecto(resultadoConsulta.getString("nombreProyecto"));
                    proyecto.setURL_requerimientoP_documentoDF(resultadoConsulta.getString("URL_requerimiento_documentoPDF"));
                    proyecto.setFK_idEmpleado(resultadoConsulta.getInt("FK_idEmpleado"));

                    proyectos.add(proyecto);
                }
            }
        } finally {
            if (resultadoConsulta != null) {
                resultadoConsulta.close();
            }
        }
        return proyectos;
    }

}
