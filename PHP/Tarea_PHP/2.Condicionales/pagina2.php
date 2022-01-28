<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Digitos</title>
</head>
<body>
    <?php
    $valor = rand(1,100);

    echo "El numero es : $valor <br>";
    if ($valor <= 9){
        echo "El numero es de un digito";
    } else if ($valor < 100){
        echo "El numero es de dos digitos";
    } else{
        echo "El numero es de tres digitos";
    }
    ?>
</body>
</html>