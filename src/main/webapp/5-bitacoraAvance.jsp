<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
<%@include file="WEB-INF/Utilidades/navbar.jsp"%>
    <div class="contenedorPadre">
        <div class="contenedorHijo">
    <h1>Bitacora de Avance</h1>
    <p>Por favor, llenar la siguiente Bitacora</p>
            <form action="procesarBitacora" method="post">
                <textarea name="bitacora" id="procedimentoBitacora" cols="30" rows="10"></textarea>
                <br><br>
                <label for="porcentajeAvance">Actualiza el porcentaje</label>
                <br><br>
                <input type="number" id="porcentajeAvance" name="porcentajeAvance">
                <br><br>
                <button type="submit" name="accion" value="actualizar">Actualizar</button>
                <button type="submit" name="accion" value="enviar">Enviar</button>
            </form>

        </div>
    </div>
<%@include file="WEB-INF/Utilidades/footer.jsp"%>

</body>
<script src="js/bootstrap.min.js"></script>
</html>