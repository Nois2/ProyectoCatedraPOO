package Models.Database;

import Models.Database.StoredProcedure.CrearNuevoSistema;
import Models.Tables.CasoRequerimiento;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcedimientosAlmacenados {
    private Conexion cn;

    public ProcedimientosAlmacenados(Conexion cn) {
        this.cn = cn;
    }
    private Conexion conexion;

    //Funcional
    //Si el proyecto es creado me retorna: Proyecto creado correctamente.
    public String crearSistema(CrearNuevoSistema crearNuevoSistema) throws SQLException {
        String resultado = "";
        String consulta = String.format(
                "CALL sp_JefeDeAreaFuncional_CrearNuevoSistema(%d, '%s', '%s', '%s', @mensaje)",
                crearNuevoSistema.getIdEmpleado(),
                crearNuevoSistema.getNombreProyecto(),
                crearNuevoSistema.getUrlRequerimientoDocumentoPDF(),
                crearNuevoSistema.getDescripcionProyecto()
        );

        // Ejecutar el procedimiento almacenado
        ResultSet resultadoConsulta = null;
        try {
            resultadoConsulta = cn.EjecutarConsultas(consulta);

            // Ahora ejecutar la consulta para obtener el valor de @mensaje
            ResultSet mensajeResultSet = cn.EjecutarConsultas("SELECT @mensaje as mensaje");
            if (mensajeResultSet.next()) {
                resultado = mensajeResultSet.getString("mensaje");
            }
            mensajeResultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener el mensaje del procedimiento almacenado", e);
        } finally {
            if (resultadoConsulta != null) {
                try {
                    resultadoConsulta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }

    //Funcional
    //Si el proyecto es creado retorna: Caso de requerimiento insertado correctamente.
    public String insertarCasoRequerimiento(CasoRequerimiento casoRequerimiento) throws SQLException {
        String resultado = "";
        String consulta = String.format(
                "CALL sp_InsertarCasoRequerimiento('%s', %d, %d, %d, %d, %d, @mensaje)",
                casoRequerimiento.getTituloCasoRequerimiento(), casoRequerimiento.getPorcentajeAvance(), casoRequerimiento.getFK_idEstadoRequerimiento(), casoRequerimiento.getFK_idEmpleado(), casoRequerimiento.getFK_idEmpleadoProbador(), casoRequerimiento.getFK_idProyecto());
        try (ResultSet resultadoConsulta = cn.EjecutarConsultas(consulta)) {
            resultadoConsulta.close();
            ResultSet mensajeResultSet = cn.EjecutarConsultas("SELECT @mensaje as mensaje");
            if (mensajeResultSet.next()) {
                resultado = mensajeResultSet.getString("mensaje");
            }
            mensajeResultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener el mensaje del procedimiento almacenado", e);
        }
        return resultado;
    }



    public static void main(String[] args){
        ProcedimientosAlmacenados ProcedimientoAlmacenado = new ProcedimientosAlmacenados(new Conexion());

        //1
        /*Prueba De Creacion de Nuevo Sistema
        CrearNuevoSistema pc = new CrearNuevoSistema();
        pc.setIdEmpleado(1);
        pc.setNombreProyecto("Proyecto");
        pc.setUrlRequerimientoDocumentoPDF("https://www.google.com.pdf");
        pc.setDescripcionProyecto("Proyecto Descripcion");

        try {
            System.out.println(ProcedimientoAlmacenado.crearSistema(pc));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Fin de Prueba Creacion de Nuevo Sistema*/


        //2
        /*Prueba de InsertarCasoRequerimiento
        CasoRequerimiento casoRequerimiento = new CasoRequerimiento();
        casoRequerimiento.setTituloCasoRequerimiento("Creacion de botones en navbar");
        casoRequerimiento.setPorcentajeAvance(99);
        casoRequerimiento.setFK_idEstadoRequerimiento(2);
        casoRequerimiento.setFK_idEmpleado(2);
        casoRequerimiento.setFK_idEmpleadoProbador(3);
        casoRequerimiento.setFK_idProyecto(1);//Proyecto creado arriba

        try {
            System.out.println(ProcedimientoAlmacenado.insertarCasoRequerimiento(casoRequerimiento));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Fin de Prueba Creacion de Nuevo Sistema*/



    }


}
