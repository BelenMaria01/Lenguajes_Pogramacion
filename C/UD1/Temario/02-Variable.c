#include <stdio.h>

int main()
{
    int x = 5;        // numero entero; 5 ,-12, 2000
    float y = 5.4;    // numero decimales; 4.4, 2.00,9,99
    double z = 55.87; // numero decimales 20.55, -23.44
    char j = 'a';     // caracteres; a, b, Z

    printf("Valor de x: %i\n", x);
    printf("Valor de y: %.2f\n", y);
    printf("Valor de z: %.2f\n", z);
    printf("Valor de j: %c\n", j);

    // * Se puede poner de en una misma linea

    printf("El valor de y y de z es : %.2f %.2f", y, z);

    return 0;
}