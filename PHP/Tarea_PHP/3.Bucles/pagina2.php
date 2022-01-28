<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bucle con While</title>
</head>
<body>
    <?php
        $valor = rand(1, 100);
        $inicio = 1;
        
        while($inicio <= $valor){
            echo $inicio;
            echo "<br>";
            $inicio++;
        }
    ?>
</body>
</html>