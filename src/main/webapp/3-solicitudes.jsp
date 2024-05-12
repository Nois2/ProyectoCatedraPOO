<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Solicitudes</title>
    <link rel="stylesheet" href="css/solicitudes.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="WEB-INF/Utilidades/navbar.jsp"%>
<div class="contenedorPadre">
    <div class="contenedorHijo">
        <h1>Solicitudes</h1>
        <p>Elige si aceptar la solicitud o rechazarla</p>
        <form action="procesarDecision" method="post">
            <label for="aceptarSoli">Aceptar solicitud </label> <input type="radio" id="aceptarSoli" name="decision" value="aceptar" required>
            <br><br>
            <label for="rechazarSoli">Rechazar solicitud </label> <input type="radio" id="rechazarSoli" name="decision" value="rechazar" required>
            <br><br>
            <textarea name="razon" id="" cols="30" rows="10"></textarea>
            <br><br>
            <button type="submit" name="accion" value="aceptar">Aceptar Solicitud</button>
            <button type="submit" name="accion" value="rechazar">Rechazar Solicitud</button>
        </form>
    </div>
</div>
<%@include file="WEB-INF/Utilidades/footer.jsp"%>

</body>
<script src="js/bootstrap.min.js"></script>
</html>
