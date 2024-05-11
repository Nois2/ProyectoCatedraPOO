package Models.Tables;

import java.util.Date;

public class BitacoraRequerimiento {
    private int PK_idBitacoraRequerimiento;
    private String DescripcionDeAvanceEnRequerimiento;
    private int PorcentajeDeAvanceRealizadoEnBitacora;
    private Date fechaActualizacionRequerimiento;
    private int FK_idEstadoBitacora;
    private int FK_idCasoRequerimiento;

    public BitacoraRequerimiento() {
    }

    public BitacoraRequerimiento(int PK_idBitacoraRequerimiento, String descripcionDeAvanceEnRequerimiento, int porcentajeDeAvanceRealizadoEnBitacora, Date fechaActualizacionRequerimiento, int FK_idEstadoBitacora, int FK_idCasoRequerimiento) {
        this.PK_idBitacoraRequerimiento = PK_idBitacoraRequerimiento;
        DescripcionDeAvanceEnRequerimiento = descripcionDeAvanceEnRequerimiento;
        PorcentajeDeAvanceRealizadoEnBitacora = porcentajeDeAvanceRealizadoEnBitacora;
        this.fechaActualizacionRequerimiento = fechaActualizacionRequerimiento;
        this.FK_idEstadoBitacora = FK_idEstadoBitacora;
        this.FK_idCasoRequerimiento = FK_idCasoRequerimiento;
    }

    public int getPK_idBitacoraRequerimiento() {
        return PK_idBitacoraRequerimiento;
    }

    public void setPK_idBitacoraRequerimiento(int PK_idBitacoraRequerimiento) {
        this.PK_idBitacoraRequerimiento = PK_idBitacoraRequerimiento;
    }

    public String getDescripcionDeAvanceEnRequerimiento() {
        return DescripcionDeAvanceEnRequerimiento;
    }

    public void setDescripcionDeAvanceEnRequerimiento(String descripcionDeAvanceEnRequerimiento) {
        DescripcionDeAvanceEnRequerimiento = descripcionDeAvanceEnRequerimiento;
    }

    public int getPorcentajeDeAvanceRealizadoEnBitacora() {
        return PorcentajeDeAvanceRealizadoEnBitacora;
    }

    public void setPorcentajeDeAvanceRealizadoEnBitacora(int porcentajeDeAvanceRealizadoEnBitacora) {
        PorcentajeDeAvanceRealizadoEnBitacora = porcentajeDeAvanceRealizadoEnBitacora;
    }

    public Date getFechaActualizacionRequerimiento() {
        return fechaActualizacionRequerimiento;
    }

    public void setFechaActualizacionRequerimiento(Date fechaActualizacionRequerimiento) {
        this.fechaActualizacionRequerimiento = fechaActualizacionRequerimiento;
    }

    public int getFK_idEstadoBitacora() {
        return FK_idEstadoBitacora;
    }

    public void setFK_idEstadoBitacora(int FK_idEstadoBitacora) {
        this.FK_idEstadoBitacora = FK_idEstadoBitacora;
    }

    public int getFK_idCasoRequerimiento() {
        return FK_idCasoRequerimiento;
    }

    public void setFK_idCasoRequerimiento(int FK_idCasoRequerimiento) {
        this.FK_idCasoRequerimiento = FK_idCasoRequerimiento;
    }
}
