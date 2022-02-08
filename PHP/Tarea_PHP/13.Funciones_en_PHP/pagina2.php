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
        function verificarClaves($cia1, $cia2){
            if ($cia1 != $cia2){
                echo "las claves ingresadas son distintas";
            }
        }
        verificarClaves($_POST['clave1'],$_POST['clave2']);
    ?>
</body>
</html>