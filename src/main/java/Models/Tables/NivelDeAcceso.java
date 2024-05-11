package Models.Tables;

public class NivelDeAcceso {
    private int PK_idNivelDeAcceso;
    private String nombreNivelDeAcceso;
    private String funcionalidadNivelDeAcceso;

    public NivelDeAcceso() {
    }

    public NivelDeAcceso(int PK_idNivelDeAcceso, String nombreNivelDeAcceso, String funcionalidadNivelDeAcceso) {
        this.PK_idNivelDeAcceso = PK_idNivelDeAcceso;
        this.nombreNivelDeAcceso = nombreNivelDeAcceso;
        this.funcionalidadNivelDeAcceso = funcionalidadNivelDeAcceso;
    }

    public int getPK_idNivelDeAcceso() {
        return PK_idNivelDeAcceso;
    }

    public void setPK_idNivelDeAcceso(int PK_idNivelDeAcceso) {
        this.PK_idNivelDeAcceso = PK_idNivelDeAcceso;
    }

    public String getNombreNivelDeAcceso() {
        return nombreNivelDeAcceso;
    }

    public void setNombreNivelDeAcceso(String nombreNivelDeAcceso) {
        this.nombreNivelDeAcceso = nombreNivelDeAcceso;
    }

    public String getFuncionalidadNivelDeAcceso() {
        return funcionalidadNivelDeAcceso;
    }

    public void setFuncionalidadNivelDeAcceso(String funcionalidadNivelDeAcceso) {
        this.funcionalidadNivelDeAcceso = funcionalidadNivelDeAcceso;
    }
}
