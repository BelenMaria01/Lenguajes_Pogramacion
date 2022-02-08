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
        $ar = fopen("datos.txt", "r") or die("No se pudo abrir el archivo");

        while(!feof($ar)){
            $linea = fgets($ar);
            $lineasalto = nl2br($linea);
            echo $lineasalto;
        }

        /*
         * nl2br es new line to br, es una funcion que hace es el salto de líneas
         * ya que no sirve el <br> ni el \n
        */
    ?>
</body>
</html>