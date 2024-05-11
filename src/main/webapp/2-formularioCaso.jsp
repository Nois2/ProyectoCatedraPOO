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
    <!--Este es el primer punto del proyecto de POO
    <nav class="menu">
    <ul>
        <li><a href="3-solicitudes.jsp">Solicitudes</a></li>
        |
        <li><a href="4-formularioAsign.jsp">Formularios de asignacion</a></li>
        |
        <li><a href="5-bitacoraAvance.jsp">Bitacoras de Avance</a></li>
        |
        <li><a href="6-decisiones.jsp">Toma de decisiones</a></li>
        |
        <li><a href="7-modificaciones.jsp">Modificaciones</a></li>
    </ul>
    </nav>
    -->
    <%@include file="WEB-INF/Utilidades/navbar.jsp"%>
    <div class="contenedorPadre"> <!--Hagamos de cuenta que es body-->
        <div class="contenedorHijo">
    <h1>Formularios</h1>
    <form action="procesarRequerimiento" method="post">
        <label for="solicitudRequeremiento">Descripcion del requerimiento: </label><input type="text" name="requerimiento" id="solicitudRequeremiento">
        <br>
        <br>
        <label for="archivoPDF">Subir PDF: </label><input type="file" name="archivo" id="archivoPDF">
        <br>
        <br>
        <button>Enviar Solicitud</button>
    </form>
        </div>
    </div>
</body>
<script src="js/bootstrap.min.js"></script>
</html>