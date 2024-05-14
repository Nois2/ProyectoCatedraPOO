package Models.Validations.StoredProcedure;

import Models.Tables.CasoRequerimiento;

public class InsertarCasoRequerimientoValidator {
    // Constante para la longitud mínima de las cadenas de texto
    private static final int LONGITUD_MINIMA_TEXTO = 3;

    // Validar que el título del caso de requerimiento tenga una longitud mínima
    public static boolean validarTituloCasoRequerimiento(String titulo) {
        return titulo != null && titulo.length() >= LONGITUD_MINIMA_TEXTO;
    }

    // Validar que el porcentaje de avance sea mayor o igual a cero
    public static boolean validarPorcentajeAvance(int porcentaje) {
        return porcentaje >= 0;
    }

    // Validar que el ID del estado de requerimiento sea un valor positivo
    public static boolean validarIdEstadoRequerimiento(int id) {
        return id >= 1;
    }

    // Validar que el ID del empleado sea un valor positivo
    public static boolean validarIdEmpleado(int id) {
        return id >= 1;
    }

    // Validar que el ID del empleado probador sea un valor positivo
    public static boolean validarIdEmpleadoProbador(int id) {
        return id >= 1;
    }

    // Validar que el ID del proyecto sea un valor positivo
    public static boolean validarIdProyecto(int id) {
        return id >= 1;
    }

    // Validar todos los campos de un objeto InsertarCasoRequerimiento
    public static boolean isDataValid(CasoRequerimiento caso) {
        return validarTituloCasoRequerimiento(caso.getTituloCasoRequerimiento()) &&
                validarPorcentajeAvance(caso.getPorcentajeAvance()) &&
                validarIdEstadoRequerimiento(caso.getFK_idEstadoRequerimiento()) &&
                validarIdEmpleado(caso.getFK_idEmpleado()) &&
                validarIdEmpleadoProbador(caso.getFK_idEmpleadoProbador()) &&
                validarIdProyecto(caso.getFK_idProyecto());
    }
}