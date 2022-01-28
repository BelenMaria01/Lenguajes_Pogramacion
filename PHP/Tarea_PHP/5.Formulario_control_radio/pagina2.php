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
        echo $_REQUEST['nombre'];
        echo "<br>";

        if($_REQUEST['radio1'] == "sin"){
            echo "No tiene estudios.";
        }
        if($_REQUEST['radio1'] == "primario"){
            echo "Tiene estudio de la Primaria.";
        }
        if($_REQUEST['radio1'] == "secundario"){
            echo "Tiene estudio de la Secundaria.";
        }
    ?>
</body>
</html>