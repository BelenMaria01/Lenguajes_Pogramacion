<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Condicionales</title>
</head>
<body>
    <?php
    $valor = rand(1, 10);
    echo "El valor sorteado es $valor<br>";
    if ($valor <= 5){
        echo "es menor o igual a 5";
    }else{
        echo "Es mayor a 5";
    }
    ?>
</body>
</html>