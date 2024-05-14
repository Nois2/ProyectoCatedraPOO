package Models.Validations.StoredProcedure;

import Models.Tables.BitacoraRequerimiento;

import java.util.Date;

public class ActualizarBitacoraRequerimientoValidator {

    // Validar el ID de la bitácora de requerimiento
    public static boolean validarIDBitacoraRequerimiento(int idBitacoraRequerimiento) {
        return idBitacoraRequerimiento >= 1;
    }

    // Validar la descripción del avance
    public static boolean validarDescripcionAvance(String descripcionAvance) {
        // Aquí podrías incluir condiciones adicionales según los requisitos específicos
        return descripcionAvance != null && !descripcionAvance.isEmpty();
    }

    // Validar el porcentaje de avance
    public static boolean validarPorcentajeAvance(int porcentajeAvance) {
        return porcentajeAvance >= 0 && porcentajeAvance <= 100;
    }

    // Validar la fecha de actualización
    public static boolean validarFechaActualizacion(Date fechaActualizacion) {
        // Podrías agregar validaciones adicionales según los requisitos, como verificar si la fecha es anterior a la actual, etc.
        return fechaActualizacion != null;
    }

    // Validar el ID del estado de la bitácora
    public static boolean validarIDEstadoBitacora(int idEstadoBitacora) {
        return idEstadoBitacora >= 1;
    }

    // Validar todos los campos de un objeto ActualizarBitacoraRequerimiento
    public static boolean isDataValidActualizarBitacoraRequerimiento(BitacoraRequerimiento bitacora) {
        return validarIDBitacoraRequerimiento(bitacora.getPK_idBitacoraRequerimiento()) &&
                validarDescripcionAvance(bitacora.getDescripcionDeAvanceEnRequerimiento()) &&
                validarPorcentajeAvance(bitacora.getPorcentajeDeAvanceRealizadoEnBitacora()) &&
                validarFechaActualizacion(bitacora.getFechaActualizacionRequerimiento()) &&
                validarIDEstadoBitacora(bitacora.getFK_idEstadoBitacora());
    }
}