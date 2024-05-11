package Models.Tables;

public class CasoRequerimiento {
    private int PK_idCasoRequerimiento;
    private String TituloCasoRequerimiento;
    private int porcentajeAvance;
    private int FK_idEstadoRequerimiento;
    private int FK_idEmpleado;
    private int FK_idEmpleadoProbador;
    private int FK_idProyecto;

    public CasoRequerimiento() {
    }

    public CasoRequerimiento(int PK_idCasoRequerimiento, String tituloCasoRequerimiento, int porcentajeAvance, int FK_idEstadoRequerimiento, int FK_idEmpleado, int FK_idEmpleadoProbador, int FK_idProyecto) {
        this.PK_idCasoRequerimiento = PK_idCasoRequerimiento;
        TituloCasoRequerimiento = tituloCasoRequerimiento;
        this.porcentajeAvance = porcentajeAvance;
        this.FK_idEstadoRequerimiento = FK_idEstadoRequerimiento;
        this.FK_idEmpleado = FK_idEmpleado;
        this.FK_idEmpleadoProbador = FK_idEmpleadoProbador;
        this.FK_idProyecto = FK_idProyecto;
    }

    public int getPK_idCasoRequerimiento() {
        return PK_idCasoRequerimiento;
    }

    public void setPK_idCasoRequerimiento(int PK_idCasoRequerimiento) {
        this.PK_idCasoRequerimiento = PK_idCasoRequerimiento;
    }

    public String getTituloCasoRequerimiento() {
        return TituloCasoRequerimiento;
    }

    public void setTituloCasoRequerimiento(String tituloCasoRequerimiento) {
        TituloCasoRequerimiento = tituloCasoRequerimiento;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public int getFK_idEstadoRequerimiento() {
        return FK_idEstadoRequerimiento;
    }

    public void setFK_idEstadoRequerimiento(int FK_idEstadoRequerimiento) {
        this.FK_idEstadoRequerimiento = FK_idEstadoRequerimiento;
    }

    public int getFK_idEmpleado() {
        return FK_idEmpleado;
    }

    public void setFK_idEmpleado(int FK_idEmpleado) {
        this.FK_idEmpleado = FK_idEmpleado;
    }

    public int getFK_idEmpleadoProbador() {
        return FK_idEmpleadoProbador;
    }

    public void setFK_idEmpleadoProbador(int FK_idEmpleadoProbador) {
        this.FK_idEmpleadoProbador = FK_idEmpleadoProbador;
    }

    public int getFK_idProyecto() {
        return FK_idProyecto;
    }

    public void setFK_idProyecto(int FK_idProyecto) {
        this.FK_idProyecto = FK_idProyecto;
    }
}
