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
        $ar = fopen("pedidos.txt", "a") or die ("Problemas en la creacion");

        fputs($ar, $_POST['nombre']);
        fputs($ar, "\n");
        fputs($ar, $_POST['direccion']);
        fputs($ar, "\n");
        
        if (isset($_POST['jamonyqueso'])){
            fputs($ar,"Cantidad de Jamon y Queso:");
            fputs($ar, "\t");
            fputs($ar, $_POST['cantjamonyqueso']);
            fputs($ar, "\n");
        }

        if (isset($_POST['napolitana'])){
            fputs($ar,"Cantidad de Napolitana:");
            fputs($ar, "\t");
            fputs($ar, $_POST['cantnapolitana']);
            fputs($ar, "\n");
        }
        
        if (isset($_POST['mozzarella'])){
            fputs($ar,"Cantidad de Mozarella:");
            fputs($ar, "\t");
            fputs($ar, $_POST['cantmozzarella']);
            fputs($ar, "\n");
        }
        fputs($ar, "---------------------------------");
        fputs($ar, "\n");
        fclose($ar);

        echo "El pedido se cargó correctamente.";
    ?>
</body>
</html>