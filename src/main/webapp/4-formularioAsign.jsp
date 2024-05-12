<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formularios de asignación</title>
    <link rel="stylesheet" href="css/formularioAsing.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="WEB-INF/Utilidades/navbar.jsp"%>
<div class="contenedorPadre">
    <div class="contenedorHijo">
        <h1>Asignar</h1>
        <form action="procesarAsignacion" method="post">
            <label for="programador1">Programador 1</label> <input type="radio" name="programador" id="programador1" value="programador1" required>
            <br>
            <label for="programador2">Programador 2</label> <input type="radio" name="programador" id="programador2" value="programador2" required>
            <br>
            <label for="fechaLimite">Fecha Limite:</label>
            <input type="date" name="fecha" id="fechaLimite" required>
            <br><br>
            <label for="descripcionElementos">Descripción de Elementos Encontrados:</label>
            <br><br>
            <textarea name="descripcionElementos" id="descripcionElementos" cols="30" rows="10"></textarea>
            <br><br>
            <label for="archivo_PDF">Archivo PDF (Opcional)</label>
            <input type="file" id="archivo_PDF" name="archivo_PDF">
            <br><br>
            <button type="submit">Asignar Caso</button>
        </form>
        <br>
        <form action="procesarPrueba" method="post">
            <label for="probador1">Probador 1</label> <input type="radio" name="probador" id="probador1" value="probador1" required>
            <br>
            <label for="probador2">Probador 2</label> <input type="radio" name="probador" id="probador2" value="probador2" required>
            <br><br>
            <button type="submit">Solicitar Prueba</button>
        </form>
    </div>
</div>
<%@include file="WEB-INF/Utilidades/footer.jsp"%>

</body>
<script src="js/bootstrap.min.js"></script>
</html>
