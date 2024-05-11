package Models.Tables;

public class EstadoRequerimiento {
    private int PK_idEstadoRequerimiento;
    private String nombreRequerimiento;
    private String descripcionDeEstadoRequerimiento;
    public EstadoRequerimiento() {}

    public EstadoRequerimiento(int PK_idEstadoRequerimiento, String nombreRequerimiento, String descripcionDeEstadoRequerimiento) {
        this.PK_idEstadoRequerimiento = PK_idEstadoRequerimiento;
        this.nombreRequerimiento = nombreRequerimiento;
        this.descripcionDeEstadoRequerimiento = descripcionDeEstadoRequerimiento;
    }

    public int getPK_idEstadoRequerimiento() {
        return PK_idEstadoRequerimiento;
    }

    public void setPK_idEstadoRequerimiento(int PK_idEstadoRequerimiento) {
        this.PK_idEstadoRequerimiento = PK_idEstadoRequerimiento;
    }

    public String getNombreRequerimiento() {
        return nombreRequerimiento;
    }

    public void setNombreRequerimiento(String nombreRequerimiento) {
        this.nombreRequerimiento = nombreRequerimiento;
    }

    public String getDescripcionDeEstadoRequerimiento() {
        return descripcionDeEstadoRequerimiento;
    }

    public void setDescripcionDeEstadoRequerimiento(String descripcionDeEstadoRequerimiento) {
        this.descripcionDeEstadoRequerimiento = descripcionDeEstadoRequerimiento;
    }
}
