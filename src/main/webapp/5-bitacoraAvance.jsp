<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bitacora de Avance</title>
    <link rel="stylesheet" href="css/bitacoraAvance.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<!--Este es el cuarto punto del proyecto de POO-->
    <nav class="menu">
    <ul>
        <li><a href="2-formularioCaso.jsp">Formularios de casos</a></li>
        |
        <li><a href="3-solicitudes.jsp">Solicitudes</a></li>
        |
        <li><a href="4-formularioAsign.jsp">Formulario de Asignacion</a></li>
        | 
        <li><a href="6-decisiones.jsp">Toma de decisiones</a></li>
        |
        <li><a href="7-modificaciones.jsp">Modificaciones</a></li>
    </ul>
    </nav>
    <div class="contenedorPadre">
        <div class="contenedorHijo">
    <h1>Bitacora de Avance</h1>
    <p>Por favor, llenar la siguiente Bitacora</p>
    <form action="procesarBitacora" method="post">
        <textarea name="bitacora" id="procedimentoBitacora" cols="30" rows="10"></textarea>
        <br>
        <br>
        <label for="">Actualiza el porcentaje</label>
        <br>
        <br>
        <input type="number" id="porcentajeAvance" name="porcentajeAvance">
        <br>
        <br>
        <button>Actualizar</button>
        <button>Enviar</button>
    </form>
        </div>
    </div>
</body>
<script src="js/bootstrap.min.js"></script>
</html>