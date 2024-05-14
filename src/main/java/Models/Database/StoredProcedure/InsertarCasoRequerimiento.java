package Models.Database.StoredProcedure;

public class InsertarCasoRequerimiento {
    private String tituloCasoRequerimiento;
    private int porcentajeAvance;
    private int idEstadoRequerimiento;
    private int idEmpleado;
    private int idEmpleadoProbador;
    private int idProyecto;
    private String mensaje;

    public InsertarCasoRequerimiento() {
        // Constructor vacío
    }

    // Getters and Setters
    public String getTituloCasoRequerimiento() {
        return tituloCasoRequerimiento;
    }

    public void setTituloCasoRequerimiento(String tituloCasoRequerimiento) {
        this.tituloCasoRequerimiento = tituloCasoRequerimiento;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public int getIdEstadoRequerimiento() {
        return idEstadoRequerimiento;
    }

    public void setIdEstadoRequerimiento(int idEstadoRequerimiento) {
        this.idEstadoRequerimiento = idEstadoRequerimiento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleadoProbador() {
        return idEmpleadoProbador;
    }

    public void setIdEmpleadoProbador(int idEmpleadoProbador) {
        this.idEmpleadoProbador = idEmpleadoProbador;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
