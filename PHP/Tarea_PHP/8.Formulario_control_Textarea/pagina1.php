<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina1.php</title>
</head>
<body>
    <?php
        echo "El nombre ingresado: " . $_POST['nombre'];
        echo "<br>";
        echo "El curriculum:" . $_POST['curriculum'];
    ?>
</body>
</html>