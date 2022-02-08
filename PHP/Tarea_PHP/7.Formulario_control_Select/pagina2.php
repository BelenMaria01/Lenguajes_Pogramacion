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
        echo $_POST['nombre '];
        if($_POST['ingresos'] == 3){
            echo "debe pagar impuesto.";
        }else{
            echo "no debe pagar impuesto a las ganancias.";
        }
   ?>
</body>
</html>