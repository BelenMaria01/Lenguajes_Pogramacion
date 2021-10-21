/*
 * Write a program that prompts for one integer value and then one floating-point value from the keyboard and displays their product.
 * ¿What happens if the user inputs the floating-point value first?
*/

#include<stdio.h>

int main(){
    int x;
    float y;

    printf("Ingrese un numero entero: ");
    scanf("%i",&x);

    printf("Ingrese un valor flotante: ");
    scanf("%f",&y);

    printf("El primer valor es : %i",x);
    printf("\nEl segundo valor es : %f",y);

    return 0;
}
/*
    Al ser un numero entero la parte entera solo lo guarda en X 
    y la parte fraccionaria y se guarda en y 
*/