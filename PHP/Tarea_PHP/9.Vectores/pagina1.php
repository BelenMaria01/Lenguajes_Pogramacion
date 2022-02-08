<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>pagina1.php</title>
</head>
<body>
    <?php
    // Se puede declarar de esta dos manera
        $nombres[] = "juan";
        $nombres[] = "pedro";
        $nombres[] = "ana";

        $edades = array ("menores", "jovenes", "adulto");

       /* for ($f = 0; $f <count($nombres); $f++){
            echo $nombres[$f];
            echo "<br>";
        } */

        // Mas comun
        foreach ($nombres as $nombre){
            echo $nombre;
            echo "<br";
        }
    ?>
</body>
</html>