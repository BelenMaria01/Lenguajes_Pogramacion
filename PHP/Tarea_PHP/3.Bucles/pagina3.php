<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de Multiplicar 2</title>
</head>
<body>
    <?php
    echo "Tabla del 2 con el for";
    echo "<br>";
    for ($i = 2; $i <= 20; $i = $i + 2){
       echo "$i <br>";
    }

    echo "</br>";
    echo "Tabla del 2 con el while";
    echo "<br>";
    $f = 2;
    while ($f <= 20){
        echo "$f <br>";
        $f = $f + 2;
    }

    echo "</br>";
    echo "Tabla del 2 con el do-while";
    echo "<br>";
    $g = 2;
    do{
        echo "$g <br>";
        $g = $g + 2;
    } while ($g <= 20);

    ?>
</body>
</html>