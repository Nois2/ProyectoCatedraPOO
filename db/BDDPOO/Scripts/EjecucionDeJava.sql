use SistemaTelecomunicaciones;
/*Crear sistema*/
CALL sp_JefeDeAreaFuncional_CrearNuevoSistema(1, 'Nuevo Proyecto', 'ruta_documento.pdf', 'Descripción del proyecto', @mensaje);
SELECT @mensaje;
/*Despues de crear un caso automaticamente se te crea automaticamente un caso (el inicial)*/

--Paso2.
    --Este es para crear casos a un sistema(seria como el problema) y las bitacoras los pedazitos de problema
    --que se van resolviendo
-- Declarar una variable para el mensaje de salida
SET @mensaje = '';

-- Ejecutar el procedimiento almacenado con los valores de ejemplo
CALL sp_InsertarCasoRequerimiento(
    'Nuevo Caso',         -- Título del caso de requerimiento
    10,                   -- Porcentaje de avance inicial
    1,                    -- ID del estado del requerimiento
    2,                    -- ID del empleado asignado
    3,                    -- ID del empleado probador (puede ser NULL)
    4,                    -- ID del proyecto asociado
    @mensaje              -- Variable para el mensaje de salida
);

-- Seleccionar el mensaje de salida para verificar el resultado
SELECT @mensaje;




--Paso3
/*Agregar bitacora requerimiento*/
CALL sp_JefeDeAreaFuncional_AgregarBitacoraRequerimiento(1, 'Avance inicial', 25, '2024-03-15', 1, @mensaje);
SELECT @mensaje;

--Paso4
/*Actualizar bitacora requerimiento*/
CALL sp_JefeDeAreaFuncional_ActualizarBitacoraRequerimiento(1, 'Nuevo avance', 50, '2024-03-15', 1, @mensaje);
SELECT @mensaje;
/*Ver Tablas de bitacora por idCaso*/
CALL sp_JefeDeAreaFuncional_VerTablaDeBitacoraPorIdDeCaso(1);

