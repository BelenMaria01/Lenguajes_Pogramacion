#include <stdio.h>

#define PI 3.1416 // macro

int main()
{
    float x = PI;
    int y;

    printf("Introduce un valor para y: ");
    scanf("%i", &y);

    printf("\nEl valor introducido de y es : %i", y);

    printf("\nX tiene el valor: %.4f", x);

    // * Operacion
    x *= y; //  x = x * y;

    printf("\nAhora X tiene el valor : %.4f", x);

    return 0;
}