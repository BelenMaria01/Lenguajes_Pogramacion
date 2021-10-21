/*
 * Write a program that inputs two floating-point values from the keyboard and displays their product.
*/

#include <stdio.h>

int main()
{
    float x, y;

    printf("Introduce un valor para X: ");
    scanf("%f", &x);
    printf("Introduce un valor para Y: ");
    scanf("%f", &y);

    printf("Valor de X es : %f y el valor Y es : %f", x, y);

    return 0;
}