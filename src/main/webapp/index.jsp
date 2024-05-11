<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesion</title>
    <link rel="stylesheet" href="css/estilo.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<!--Este sera el inicio de sesion-->

<form action="procesarInicio" method="post">
    <div class="contenedorPadre">
        <div class="contenedorHijo">
            <h1>Inicio de Sesion</h1>
            <img src="image/images.png" alt="" width="100px" height="100px">
            <br>
            <br>
            <label>Nombre: </label><input type="text" name="Usuario" id="usuarioPrincipal" placeholder="Usuario"> <!--Aqui es el inicio de sesion del usuario-->
            <br>
            <br>
            <label>Contraseña: </label><input type="text" name="Contraseña" id="contraseñaPrincipal" placeholder="Contraseña">
            <br>
            <br>
            <button>Iniciar Sesion</button>
        </div>
    </div>
</form>
</body>
<script src="js/bootstrap.min.js"></script>
</html>