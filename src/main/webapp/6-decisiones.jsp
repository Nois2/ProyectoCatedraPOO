<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
<%@include file="WEB-INF/Utilidades/navbar.jsp"%>
    <div class="contenedorPadre">
        <div class="contenedorHijo">
    <h1>Toma de decisiones</h1>
            <form id="formularioDecision" action="procesarDecision" method="post">
                <label for="aprobar">
                    Aprobar
                    <input type="radio" name="decision" id="aprobar" value="aprobar" required>
                </label>
                <br><br>
                <label for="rechazar">
                    Rechazar
                    <input type="radio" name="decision" id="rechazar" value="rechazar" required>
                </label>
                <br><br>
                <button type="submit">Enviar decisión</button>
            </form>

        </div>
    </div>
<%@include file="WEB-INF/Utilidades/footer.jsp"%>
</body>
<script src="js/bootstrap.min.js"></script>
</html>