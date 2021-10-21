// * Intercamiar los valores de dos numeros enteros introducido por teclado
#include <stdio.h>

int main()
{
    int x, y, aux;

    printf("Introduce un numero entero para x: ");
    scanf("%i", &x);

    printf("Introduce otro nuemro entero para y: ");
    scanf("%i", &y);

    printf("\nX vale %i", x);
    printf("\nY vale %i", y);
    // Ahora se intercambia
    aux=x;
    x=y;
    y=aux;

    printf("\nAhora X vale %i", x);
    printf("\nAhora Y vale %i", y);

    return 0;
}