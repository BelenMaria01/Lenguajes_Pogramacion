#include <stdio.h>
#include <stdlib.h> // Libreria que uso para rand
#include <time.h>   // Libreria que uso para el time de srand
#include <funciones.h> // Para llamar a la funcion.h que esta en el misma carpeta que EjemploExtra3

// Le digo al la funcion principal que abajo del main esta la funcion
void Menu();
int DameNumero();
void Aleatorio();
void Salir();

// Funcion Principal
int main()
{
    char opcion;       // Para la letra del menu
    int finalizar = 0; // Para finalizar el bucle del menu

    srand(time(NULL)); // Cambia el valor en un intervalo de tiempo, o cada vez que ejecute el programa

    while (!finalizar)
    {
        // Imprime el menu por pantalla
        Menu();
        scanf("\n%c", &opcion);

        // Lo que hace cada opciones del menu
        switch (opcion)
        {
        case 'a':
            DameNumero();
            break;
        case 'b':
            DameLetra();
            break;
        case 'c':
            Aleatorio();
            break;
        case 'd':
            Salir();
            finalizar=1;
            break;
        default:
            printf("\nEsa opcion no es valida\n");
        }
    }
    return 0;
}