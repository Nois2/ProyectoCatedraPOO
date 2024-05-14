package Models.Database.StoredProcedure;

public class ObtenerNivelDeAccesoDeEmpleado {
    private int idEmpleado;
    private String nivelAcceso;

    public ObtenerNivelDeAccesoDeEmpleado() {
        // Constructor vacío
    }

    // Getters and Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
