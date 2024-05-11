<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Decisiones</title>
    <link rel="stylesheet" href="css/decisiones.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<!--Este es el quinto punto del proyecto de POO-->
    <nav class="menu">
    <ul>
        <li><a href="2-formularioCaso.jsp">Formularios de casos</a></li>
        |
        <li><a href="3-solicitudes.jsp">Solicitudes</a></li>
        |
        <li><a href="4-formularioAsign.jsp">Formulario de Asignacion</a></li>
        |
        <li><a href="5-bitacoraAvance.jsp">Bitacoras de Avance</a></li>
        |
        <li><a href="7-modificaciones.jsp">Modificaciones</a></li>
    </ul>
    </nav>
    <div class="contenedorPadre">
        <div class="contenedorHijo">
    <h1>Toma de decisiones</h1>
    <form action="procesarDecision" method="post">
        <label for="">Aprobar</label> <input type="radio" name="decision" id="aprobar" value="aprobar" required>
        <br>
        <br>
        <label for="">Rechazar</label> <input type="radio" name="decision" id="rechazar" value="rechazar" required>
        <br>
        <br>
        <button>Enviar decision</button>
    </form>
        </div>
    </div>
</body>
<script src="js/bootstrap.min.js"></script>
</html>