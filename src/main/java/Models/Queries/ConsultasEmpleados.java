package Models.Queries;

import Models.Database.Conexion;
import Models.Tables.Empleados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasEmpleados {

    private Conexion cn;

    public ConsultasEmpleados(Conexion conexion) {
        this.cn = conexion;
    }

    //Obtiene todos los empleados
    public ArrayList<Empleados> ObtenerEmpleados() throws SQLException {
        ArrayList<Empleados> empleados = new ArrayList<>();
        ResultSet resultadoConsulta = cn.EjecutarConsultas("SELECT * FROM Empleados;");
        try {
            if (resultadoConsulta != null) {
                while (resultadoConsulta.next()) {
                    Empleados empleado = new Empleados();
                    empleado.setPK_idEmpleado(resultadoConsulta.getInt("PK_idEmpleado"));
                    empleado.setNombres(resultadoConsulta.getString("nombres"));
                    empleado.setApellidos(resultadoConsulta.getString("apellidos"));
                    empleado.setMail(resultadoConsulta.getString("mail"));
                    empleado.setPasswd(resultadoConsulta.getString("passwd"));
                    empleado.setFK_empleadoEncargado(resultadoConsulta.getInt("FK_empleadoEncargado"));
                    empleados.add(empleado);
                }
            }
        } finally {
            if (resultadoConsulta != null) {
                resultadoConsulta.close();
            }
        }
        return empleados;
    }

    //Obtiene los datos de un empleado por medio de un objeto y de correo y contraseña
    public Empleados ObtenerEmpleadoPorCorreoYPassword(Empleados e) throws SQLException {
        Empleados empleadoData = new Empleados();
        ResultSet resultadoConsulta = cn.EjecutarConsultas("SELECT * FROM Empleados WHERE mail='" + e.getMail() + "' AND passwd='" + e.getPasswd() + "'");
        try {
            if (resultadoConsulta != null && resultadoConsulta.next()) {
                empleadoData.setPK_idEmpleado(resultadoConsulta.getInt("PK_idEmpleado"));
                empleadoData.setNombres(resultadoConsulta.getString("nombres"));
                empleadoData.setApellidos(resultadoConsulta.getString("apellidos"));
                empleadoData.setMail(resultadoConsulta.getString("mail"));
                empleadoData.setPasswd(resultadoConsulta.getString("passwd"));
                empleadoData.setFK_empleadoEncargado(resultadoConsulta.getInt("FK_empleadoEncargado"));
            }
        } finally {
            if (resultadoConsulta != null) {
                resultadoConsulta.close();
            }
        }
        return empleadoData;
    }

    //Obtiene los datos de un empleado por medio de correo y contraseña
    public Empleados ObtenerEmpleadoPorCorreoYPassword(String email, String passwd) throws SQLException {
        Empleados empleadoData = new Empleados();
        ResultSet resultadoConsulta = cn.EjecutarConsultas("SELECT * FROM Empleados WHERE mail='" + email + "' AND passwd='" + passwd + "'");
        try {
            if (resultadoConsulta != null && resultadoConsulta.next()) {
                empleadoData.setPK_idEmpleado(resultadoConsulta.getInt("PK_idEmpleado"));
                empleadoData.setNombres(resultadoConsulta.getString("nombres"));
                empleadoData.setApellidos(resultadoConsulta.getString("apellidos"));
                empleadoData.setMail(resultadoConsulta.getString("mail"));
                empleadoData.setPasswd(resultadoConsulta.getString("passwd"));
                empleadoData.setFK_empleadoEncargado(resultadoConsulta.getInt("FK_empleadoEncargado"));
                empleadoData.setFK_idNivelDeAcceso(resultadoConsulta.getInt("FK_idNivelDeAcceso"));
            }

        } finally {
            if (resultadoConsulta != null) {
                resultadoConsulta.close();
            }
        }
        return empleadoData;
    }

    //Me devuelve un bool si existe el empleado en la base de datos recibiendo un objeto
    public boolean existeEmpleado(Empleados e) throws SQLException {
        ResultSet resultadoConsulta = cn.EjecutarConsultas("SELECT * FROM Empleados WHERE mail='" + e.getMail() + "' AND passwd='" + e.getPasswd() + "'");
        try {
            return resultadoConsulta != null && resultadoConsulta.next();
        } finally {
            if (resultadoConsulta != null) {
                resultadoConsulta.close();
            }
        }
    }

    //Me devuelve un bool si existe el empleado en la base de datos recibiendo dos Cadenas una con el correo y otra con la contraseña
    public boolean existeEmpleado(String email, String passwd) throws SQLException {
        ResultSet resultadoConsulta = cn.EjecutarConsultas("SELECT * FROM Empleados WHERE mail='" + email + "' AND passwd='" + passwd + "'");
        try {
            return resultadoConsulta != null && resultadoConsulta.next();
        } finally {
            if (resultadoConsulta != null) {
                resultadoConsulta.close(); //Cierra el resulset para poder usarlo en mas conexiones
            }
        }
    }
}
