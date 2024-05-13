<%--
  Created by IntelliJ IDEA.
  User: Isaias
  Date: 11/5/2024
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Creación de Proyecto</title>
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
    <h1 class="mb-4">Crear Nuevo Proyecto</h1>
    <form>
        <div class="mb-3">
            <label for="nombreProyecto" class="form-label">Nombre del Proyecto</label>
            <input type="text" class="form-control" id="nombreProyecto" required>
        </div>
        <div class="mb-3">
            <label for="URL_requerimiento_documentoPDF" class="form-label">URL del Requerimiento (PDF)</label>
            <input type="text" class="form-control" id="URL_requerimiento_documentoPDF" required>
        </div>
        <div class="mb-3">
            <label for="descripcionProyecto" class="form-label">Descripción del Proyecto</label>
            <textarea class="form-control" id="descripcionProyecto" rows="3" required></textarea>
        </div>
        <div class="mb-3">
            <label for="idEmpleado" class="form-label">ID del Empleado</label>
            <input type="number" class="form-control" id="idEmpleado" required>
        </div>
        <button type="submit" class="btn btn-primary">Crear Proyecto</button>
    </form>
    <div class="mt-4" id="mensaje">
        <!-- Aquí se mostrará el mensaje de salida -->
    </div>
</div>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</body>
</html>
