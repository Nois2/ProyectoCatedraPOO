package Models.Queries;

import Models.Database.Conexion;
import Models.Tables.NivelDeAcceso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasNivelDeAcceso {
    Conexion cn;

    public ConsultasNivelDeAcceso(Conexion cn) {
        this.cn = cn;
    }

    public ArrayList<NivelDeAcceso> obtenerTablaNivelDeAcceso() {
        ArrayList<NivelDeAcceso> nivelDeAcceso = new ArrayList<>();
        try {
            ResultSet rs = cn.EjecutarConsultas("SELECT * FROM NivelDeAcceso");
            while (rs.next()) {
                NivelDeAcceso n = new NivelDeAcceso();
                n.setPK_idNivelDeAcceso(rs.getInt("PK_idNivelDeAcceso"));
                n.setNombreNivelDeAcceso(rs.getString("nombreNivelDeAcceso"));
                n.setFuncionalidadNivelDeAcceso(rs.getString("funcionalidadDeNivelDeAcceso"));
                nivelDeAcceso.add(n); // Agregar el objeto a la lista
            }
                rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nivelDeAcceso;
    }


}
