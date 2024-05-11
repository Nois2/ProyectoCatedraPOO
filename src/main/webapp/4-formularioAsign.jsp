<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formularios de asignacion</title>
    <link rel="stylesheet" href="css/formularioAsing.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<!--Este es el tercer punto del proyecto de POO-->
    <nav class="menu">
    <ul>
        <li><a href="2-formularioCaso.jsp">Formularios de casos</a></li>
        |
        <li><a href="3-solicitudes.jsp">Solicitudes</a></li>
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
    <h1>Asignar</h1>
    <form action="procesarAsignacion" method="post"> <!--Aqui puedes elegir el form para procesar los datos-->
        <label for="">Programador 1</label> <input type="radio" name="programador" id="programador1" value="programador1" required>
        <br>
        <label for="">Programador 2</label> <input type="radio" name="programador" id="programador2" value="programador2" required>
        <br>
        <label for="">Fecha Limite:</label>
        <input type="date" name="fecha" id="fechaLimite" required>
        <br>
        <br>
        <label for="">Descripcion de Elementos Encontrados: </label>
        <br>
        <br>
        <textarea name="Descripcion de Elementos" id="descripcionElementos" cols="30" rows="10"></textarea>
        <br>
        <br>
        <label for="">Archivo PDF (Opcional)</label>
        <input type="file" id="archivo_PDF" name="archivo_PDF">
        <br>
        <br>
        <button>Asignar Caso</button>
    </form>
    <br>
    <form action="procesarPrueba">
        <label for="">Probador 1</label> <input type="radio" name="probador1" id="probador1" value="probador1" required>
        <br>
        <label for="">Probador 2</label> <input type="radio" name="probador2" id="probador2" value="probador2" required>
        <br>
        <br>
        <button>Solicitar Prueba</button>
    </form>
        </div>
    </div>
</body>
<script src="js/bootstrap.min.js"></script>
</html>