package Models.Queries;

import Models.Database.Conexion;
import Models.Tables.EstadoBitacora;
import com.oracle.wls.shaded.org.apache.xpath.operations.Bool;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasEstadoBitacora {
    private Conexion cn;
    public ConsultasEstadoBitacora(Conexion con) {
        this.cn = con;
    }

    public ArrayList<EstadoBitacora> ObtenerTablaEstadoBitacora() throws SQLException {
        ArrayList<EstadoBitacora> listaEstadoBitacora = new ArrayList<>();
        ResultSet rs = cn.EjecutarConsultas("SELECT * FROM EstadoBitacora");
        try{
            while (rs.next()) {
                EstadoBitacora estadoBitacora = new EstadoBitacora();
                estadoBitacora.setPK_idEstadoBitacora(rs.getInt("PK_idEstadoBitacora"));
                estadoBitacora.setNombreEstadoBitacora(rs.getString("nombreEstadoBitacora"));
                estadoBitacora.setDescripcionEstadoBitacora(rs.getString("descripcionEstadoBitacora"));
                listaEstadoBitacora.add(estadoBitacora);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            rs.close();
        }

        return listaEstadoBitacora;

    }
    public Boolean existeEstadoBitacora(int idEstadoBitacora) throws SQLException {
        Boolean isExist = false;
        ArrayList<EstadoBitacora> listaEstadoBitacora = new ArrayList<>();
        ResultSet rs = cn.EjecutarConsultas("SELECT * FROM EstadoBitacora");
        try{
            while (rs.next()) {
                EstadoBitacora estadoBitacora = new EstadoBitacora();
                estadoBitacora.setPK_idEstadoBitacora(rs.getInt("PK_idEstadoBitacora"));
                estadoBitacora.setNombreEstadoBitacora(rs.getString("nombreEstadoBitacora"));
                estadoBitacora.setDescripcionEstadoBitacora(rs.getString("descripcionEstadoBitacora"));
                listaEstadoBitacora.add(estadoBitacora);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            rs.close();
        }
            if(!listaEstadoBitacora.isEmpty()){isExist = true;}
        return isExist;

    }
}
