/*
 * Enter this program and compile it. What does it do?
*/

#include <stdio.h>

int radius, area;

int main(){
    printf("Introduce un valor para la radio: ");
    scanf("%d",&radius);

    area = (int)(3.14159 * radius * radius);
    printf("\nArea = %d\n",area);

    return 0;
}

/*
    Calcula el area de un circulo, pide al usuario un valor para la radio
    y muestra por pantalla la solucion.
*/