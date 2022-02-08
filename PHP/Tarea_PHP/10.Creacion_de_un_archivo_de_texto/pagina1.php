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
        $ar = fopen("datos.txt", "a") or die ("Problemas en la creacion");

        fputs($ar, $_POST['nombre']);
        fputs($ar, "\n");
        fputs($ar, $_POST['comentarios']);
        fputs($ar, "\n");
        fputs($ar, "---------------------------------");
        fputs($ar, "\n");
        fclose($ar);

        echo "Los datos se cargaron correctamente.";

        /*
         * a -> Lo crea o si ya existe el archivo lo abre para añadir datos al final
         * w -> crea el archivo de texto, si existe borra su contenido
         * r -> abre el archivo para su lectura
        */
    ?>
</body>
</html>