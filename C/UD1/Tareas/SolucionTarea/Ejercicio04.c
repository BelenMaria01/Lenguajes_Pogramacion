/*
 * The following program has a problem. Find it.
*/

#include <stdio.h>
int main(void)
{
    printf("This is a program with a ");
    do_it("problem!");
    return 0;
}
/*
    Muestra un error en la linea 8, ya que ese dot_it y no es ninguna 
    funcion de programacion, se reemplazaria con un printf
*/