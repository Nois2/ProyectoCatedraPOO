package Models.Tables;

public class Departamentos {
    private int PK_idDepartamento;
    private String nombreDepartamento;
    private int FK_idEmpleado;

    public Departamentos() {
    }

    public Departamentos(int PK_idDepartamento, String nombreDepartamento, int FK_idEmpleado) {
        this.PK_idDepartamento = PK_idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.FK_idEmpleado = FK_idEmpleado;
    }

    public int getPK_idDepartamento() {
        return PK_idDepartamento;
    }

    public void setPK_idDepartamento(int PK_idDepartamento) {
        this.PK_idDepartamento = PK_idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getFK_idEmpleado() {
        return FK_idEmpleado;
    }

    public void setFK_idEmpleado(int FK_idEmpleado) {
        this.FK_idEmpleado = FK_idEmpleado;
    }
}
