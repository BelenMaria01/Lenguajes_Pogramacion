<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>pagina1.php</title>
</head>
<body>
    <?php
        $nombre = $_POST['nombre'];
        $mail = $_POST['mail'];
        $codigocurso = $_POST['codigocurso'];

        $conexion = mysqli_connect("localhost:3307", "root", "usuario", "base1")
        or die("Problema con la conexion");

        mysqli_query($conexion, "insert into alumnos(nombre,mail,codigocurso) values ('$nombre', '$mail', '$codigocurso')")
        or die("Problema en el select" . mysqli_error($conexion));

        mysqli_close($conexion);

        echo "El alumno fue dado de alta.";
    ?>
</body>
</html>