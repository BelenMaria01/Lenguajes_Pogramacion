<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>pagina2.php</title>
</head>
<body>
    <?php
        $ar = fopen ("pedidos.txt","r") or die ("No se pudo abrir el archivo");
        while (!feof($ar)) {
            $linea = fgets($ar);
            $lineasalto = nl2br($linea);
            echo $lineasalto;
        }
        fclose($ar);
    ?>
</body>
</html>