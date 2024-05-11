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
    <nav class="menu">
    <ul>
        <li><a href="2-formularioCaso.jsp">Formularios de casos</a></li>
        |
        <li><a href="3-solicitudes.jsp">Solicitudes</a></li>
        |
        <li><a href="4-formularioAsign.jsp">Formularios de asignacion</a></li>
        |
        <li><a href="5-bitacoraAvance.jsp">Bitacoras de Avance</a></li>
        |
        <li><a href="6-decisiones.jsp">Toma de decisiones</a></li>
    </ul>
    </nav>
    <div class="contenedorPadre">
        <div class="contenedorHijo">
    <h1>Procedimiento de observaciones</h1>
    <form action="procesarObservaciones" method="post">
        <label for="">Observaciones: </label>
        <br>
        <br>
        <textarea name="observaciones" id="observaciones" cols="30" rows="10"></textarea>
        <br>
        <br>
        <button>Enviar Correciones</button>
    </form>
    <br>
    <form action="procesarFecha" method="post">
        <label for="">Fecha en producción: </label>
        <input type="date" name="fechaProduccion" id="fechaProduccion" required>
        <br>
        <br>
        <button>Asignar Fecha de producción</button>
    </form>
        </div>
    </div>
</body>
<script src="js/bootstrap.min.js"></script>
</html>