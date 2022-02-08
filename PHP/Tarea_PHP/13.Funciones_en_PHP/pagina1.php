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
        function mostrartitulo($men){
            echo '<h1 style=\"text-align:center\">';
            echo $men;
            echo "</h1>";
        }

        mostrartitulo("Primer titulo");
        echo "<br>";
        mostrartitulo("Segundo segundo");

        function retornarpromedio($valor1, $valor2){
            $pro = $valor1 / $valor2;
            return $pro;
        }

        $v1 = 100;
        $v2 = 50;
        $p = retornarpromedio($v1, $v2);
        echo $p;

        function cuadradocubo($valor, $cuad, $cub){
            $cuad = $valor * $valor;
            $cub = $valor * $valor * $valor;
        }

        cuadradocubo(2, $c1, $c2);
        echo "El cuadrado de 2 es: " . $c1 . "<br>";
        echo "El cubo de 2 es: " . $c2;
    ?>
</body>
</html>