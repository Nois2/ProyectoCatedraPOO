<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formularios</title>
    <link rel="stylesheet" href="css/formularioCaso.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="WEB-INF/Utilidades/navbar.jsp"%>
<div class="contenedorPadre">
    <div class="contenedorHijo">
        <h1>Formularios</h1>
        <form action="procesarRequerimiento" method="post">
            <label for="solicitudRequerimiento">Descripción del requerimiento:</label>
            <input type="text" name="requerimiento" id="solicitudRequerimiento">
            <br><br>
            <label for="archivoPDF">Subir PDF:</label>
            <input type="file" name="archivo" id="archivoPDF">
            <br><br>
            <button type="submit">Enviar Solicitud</button>
        </form>
    </div>
</div>
<%@include file="WEB-INF/Utilidades/footer.jsp"%>
</body>
<script src="js/bootstrap.min.js"></script>
</html>
