<%--
  Created by IntelliJ IDEA.
  User: Isaias
  Date: 12/5/2024
  Time: 00:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Bitácora de Requerimiento</title>
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
    <h1 class="mb-4">Agregar Bitácora de Requerimiento</h1>
    <form id="addForm">
        <div class="mb-3">
            <label for="idCasoRequerimiento" class="form-label">ID del Caso de Requerimiento</label>
            <input type="number" class="form-control" id="idCasoRequerimiento" required>
        </div>
        <div class="mb-3">
            <label for="descripcionAvance" class="form-label">Descripción de Avance</label>
            <input type="text" class="form-control" id="descripcionAvance" required>
        </div>
        <div class="mb-3">
            <label for="porcentajeAvance" class="form-label">Porcentaje de Avance</label>
            <input type="number" class="form-control" id="porcentajeAvance" required>
        </div>
        <div class="mb-3">
            <label for="fechaActualizacion" class="form-label">Fecha de Actualización</label>
            <input type="date" class="form-control" id="fechaActualizacion" required>
        </div>
        <div class="mb-3">
            <label for="idEstadoBitacora" class="form-label">ID de Estado de Bitácora</label>
            <input type="number" class="form-control" id="idEstadoBitacora" required>
        </div>
        <button type="submit" class="btn btn-primary">Agregar Bitácora</button>
    </form>
    <div class="mt-4" id="mensaje">
        <!-- Aquí se mostrará el mensaje de salida -->
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>
