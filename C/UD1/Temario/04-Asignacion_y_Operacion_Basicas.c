#include <stdio.h>
#include <math.h>
int main()
{
    int x, y;
    x = 10;
    y = 2;

    // * Operaciones Basicas ( suma , resta, multi, div )
    x += y; // x = x + y;
    printf("\nLa suma de X y de Y es: ", x);

    x -= y; // x = x - y;
    printf("\nLa resta de X y de Y es: ", x);

    x *= y; // x = x * y;
    printf("\nLa mult de X y de Y es:", x);

    x /= y; // x = x / y;
    printf("\nLa div de X y de Y es:", x);

    // * Con math.h
    x = pow(y, x); // elevado a (y^x)
    printf("\nEl valor de Y elevado a X es: %i", x);

    x = sqrt (x); // raiz cuadrada
    printf("\nLa raiz cuadrada de X es: %i", x);

    // * Operacion de incremento y descremento

    x++;
    printf("\nEl valor de X es: %i", x);

    y--;
    printf("\nEl valor de Y es: %i", y);
    return 0;
}