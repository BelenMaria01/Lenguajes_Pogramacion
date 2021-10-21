/*
 * Make the following change to the program in exercise 2. What does it do now?
*/

#include <stdio.h>
int x, y;
int main(void)
{
    for (x = 0; x < 10; x++, printf("\n"))
        for (y = 0; y < 10; y++)
            printf("%c",88);
    return 0;
}

/*
    Sigue saliendo X ya que 88 es la letra x en ASCII 
*/