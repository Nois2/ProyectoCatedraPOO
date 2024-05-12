<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modificaciones</title>
    <link rel="stylesheet" href="css/modificaciones.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<!--Este es el sexto punto, tanto para 6a y 6b punto del proyecto de POO-->
<%@include file="WEB-INF/Utilidades/navbar.jsp"%>
    <div class="contenedorPadre">
        <div class="contenedorHijo">
    <h1>Procedimiento de observaciones</h1>
            <form action="procesarDatos" method="post">
                <label for="observaciones">Observaciones:</label><br><br>
                <textarea name="observaciones" id="observaciones" cols="30" rows="10"></textarea><br><br>

                <label for="fechaProduccion">Fecha en producción:</label>
                <input type="date" name="fechaProduccion" id="fechaProduccion" required><br><br>

                <button type="submit" name="accion" value="enviarObservaciones">Enviar Correciones</button>
                <button type="submit" name="accion" value="asignarFecha">Asignar Fecha de producción</button>
            </form>

        </div>
    </div>
</body>
<%@include file="WEB-INF/Utilidades/footer.jsp"%>

<script src="js/bootstrap.min.js"></script>
</html>