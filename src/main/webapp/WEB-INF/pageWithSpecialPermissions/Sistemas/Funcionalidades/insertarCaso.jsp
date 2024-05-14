<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insertar Caso</title>
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
    <h1 class="mb-4">Insertar el caso requerido</h1>
    <form id="addForm">
        <div class="mb-3">
            <label for="idPorcentajeAvance" class="form-label">Porcentaje del Avance</label>
            <input type="number" class="form-control" id="idPorcentajeAvance" name="sp_porcentajeAvance" required>
        </div>
        <div class="mb-3">
            <label for="idEstadoRequerimiento" class="form-label">Estado del requerimiento</label>
            <input type="number" class="form-control" id="idEstadoRequerimiento" name="sp_FK_idEstadoRequerimiento" required>
        </div>
        <div class="mb-3">
            <label for="idEmpleado" class="form-label">Empleado Encargado</label>
            <input type="number" class="form-control" id="idEmpleado" name="sp_FK_idEmpleado" max="100" required>
        </div>
        <div class="mb-3">
            <label for="idEmpleadoProbador" class="form-label">Tester encargado</label>
            <input type="number" class="form-control" id="idEmpleadoProbador" name="sp_FK_idEmpleadoProbador" required>
        </div>
        <div class="mb-3">
            <label for="idProyecto" class="form-label">Codigo de Proyecto</label>
            <input type="number" class="form-control" id="idProyecto" name="sp_FK_idProyecto" required>
        </div>
        <button type="submit" class="btn btn-primary">Insertar Caso</button>
    </form>
    <div class="mt-4" id="mensaje" name="mensaje">
        <!-- Aquí se mostrará el mensaje de salida -->
    </div>
    <a class="btn btn-primary" href="/panelDeControl.jsp">Ir a Inicio</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>
