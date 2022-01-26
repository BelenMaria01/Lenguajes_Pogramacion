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
        $valor = rand(1, 3);

        if ($valor == 1){
            echo "$valor - uno";
        }else if ($valor == 2){
            echo "$valor - dos";
        }else{
            echo "$valor - tres";
        }
    ?>
</body>
</html>