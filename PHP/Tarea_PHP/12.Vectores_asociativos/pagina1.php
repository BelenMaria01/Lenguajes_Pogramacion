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

    // * Primera forma para hacer un vector asociativo
    /*
        $registro['dni'] = "20456322";
        $registro['nombre'] = "Martinez Pablo";
        $registro['direccion'] = "Colon 134";

    //* Muestra por pantalla los vectores, en este caso el nombre
        echo $registro['nombre'];
    */

    // * Segunda forma para hacer un vector asociativo
    /*
        $registro = array(
            'dni' => '20456322',
            'nombre' => 'Martinez Pablo',
            'direccion' => 'colon 134'
        );

    //* Muestra por pantalla los vectores, en este caso el dni
        echo $registro['dni'];
    */
    
        $articulo = array(
            'codigo' => 1,
            'descripcion' => 'manzanas',
            'precio' => 30.25
        );
    
        //* Para recorrer en forma completa un vector asociativo en PHP
        foreach ( $articulo as $clave => $valor){
            echo 'Para la clave : ' . $clave . " almacena el valor " . $valor;
            echo "<br>";
        }
    ?>
</body>
</html>