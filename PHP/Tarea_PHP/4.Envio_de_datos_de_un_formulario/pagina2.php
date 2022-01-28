<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Problema propuesto</title>
</head>
<body>
    <?php
        echo "El nombre ingresado es: ";
        echo $_POST['nombre'];
        echo "<br>";

        echo "La edad ingresado es: ";
        echo $_POST['edad'];
        echo "<br>";

        if($_POST['edad'] >= 18){
            echo "Es mayor de edad.";
        }else{
            echo "Es menor de edad.";
        }
    ?>
</body>
</html>