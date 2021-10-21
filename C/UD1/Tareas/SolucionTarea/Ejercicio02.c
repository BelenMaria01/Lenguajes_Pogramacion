/*
 * Enter this program and compile it. What does it do?
*/

#include <stdio.h>
int x, y;

int main(void)
{
    for (x = 0; x < 10; x++, printf("\n"))
        for (y = 0; y < 10; y++)
            printf("X");

    return 0;
}

/*
 Este programa hace que cada 10 X salte de linea asi hasta hacerlo 10 veces
*/
