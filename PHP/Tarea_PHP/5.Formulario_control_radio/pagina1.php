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
        if($_POST['radio1'] == "suma"){
            $suma = $_POST['valor1'] + $_POST['valor2'];
            echo "La suma es:" . $suma;
        }else if($_POST['radio1'] == "resta"){
            $resta = $_POST['valor1'] - $_POST['valor2'];
            echo "La resta es:" . $resta;
        }
    ?>
</body>
</html>