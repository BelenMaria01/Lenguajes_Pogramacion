<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina2.php</title>
</head>
<body>
    <?php
        $semanas[] = "Lunes";
        $semanas[] = "Martes";
        $semanas[] = "Miercoles";
        $semanas[] = "Jueves";
        $semanas[] = "Viernes";
        $semanas[] = "Sabado";
        $semanas[] = "Domingo";

        echo "Primer dia de la semana:" . $semanas[0];
        echo "<br>";
        echo "Ultimo dia de la semana:" . $semanas[6];
    ?>
</body>
</html>