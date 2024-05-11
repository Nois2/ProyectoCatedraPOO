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
<!--Este es el segundo punto del proyecto de POO-->
    <nav class="menu">
    <ul>
        <li><a href="2-formularioCaso.jsp">Formularios de casos</a></li>
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
    <div class="contenedorPadre">
        <div class="contenedorHijo">
    <h1>Solicitudes</h1>
    <p>Elige si aceptar la solicitud o recharzar la solicitud</p>
    <form action="procesarDecision" method="post">
        <label for="">Aceptar solicitud </label> <input type="radio" id="aceptarSoli" name="Aceptar" required>
        <br>
        <br>
        <label for="">Rechazar solicitud </label> <input type="radio" id="rechazarSoli" name="Rechazar" required>
        <br>
        <br>
        <textarea name="decisionSolicitud" id="" cols="30" rows="10"></textarea>
        <br>
        <br>
        <button>Aceptar Solicitud</button>
        <button>Rechazar Solicitud</button>
    </form>
        </div>
    </div>
</body>
<script src="js/bootstrap.min.js"></script>
</html>