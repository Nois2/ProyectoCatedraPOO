<%--
  Created by IntelliJ IDEA.
  User: Isaias
  Date: 12/5/2024
  Time: 00:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Actualizar Bitácora de Requerimiento</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">    <style>
        body {
            padding-top: 50px;
            padding-bottom: 50px;
        }
        .container {
            max-width: 600px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="mb-4">Actualizar Bitácora de Requerimiento</h1>
    <form id="updateForm">
        <div class="mb-3">
            <label for="sp_idBitacoraRequerimiento" class="form-label">ID de la Bitácora de Requerimiento</label>
            <input type="number" class="form-control" name="sp_idBitacoraRequerimiento" id="sp_idBitacoraRequerimiento" required>
        </div>
        <div class="mb-3">
            <label for="sp_descripcionAvance" class="form-label">Descripción de Avance</label>
            <input type="text" class="form-control" name="sp_descripcionAvance" id="sp_descripcionAvance" required>
        </div>
        <div class="mb-3">
            <label for="porcentajeAvance" class="form-label">Porcentaje de Avance</label>
            <input type="number" class="form-control" name="sp_porcentajeAvance" id="porcentajeAvance" required>
        </div>
        <div class="mb-3">
            <label for="fechaActualizacion" class="form-label">Fecha de Actualización</label>
            <input type="date" class="form-control" name="sp_fechaActualizacion" id="fechaActualizacion" required>
        </div>
        <div class="mb-3">
            <label for="idEstadoBitacora" class="form-label">ID de Estado de Bitácora</label>
            <input type="number" class="form-control" name="sp_idEstadoBitacora" id="idEstadoBitacora" required>
        </div>
        <button type="submit" class="btn btn-primary">Actualizar Bitácora</button>
    </form>
    <div class="mt-4" id="mensaje">
        <!-- Aquí se mostrará el mensaje de salida -->
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
