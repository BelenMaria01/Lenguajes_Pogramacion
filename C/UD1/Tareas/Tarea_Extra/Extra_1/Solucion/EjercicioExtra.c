#include <stdio.h>
#include <stdlib.h> // Libreria que uso para rand
#include <time.h>   // Libreria que uso para el time de srand

int main()
{
    char opcion;       // Para la letra del menu
    int finalizar = 0; // Para finalizar el bucle del menu
    int numero;        // Para la opcion a
    char letra;        // Para la opcion b

    srand(time(NULL)); // Cambia el valor en un intervalo de tiempo, o cada vez que ejecute el programa

    while (!finalizar)
    {
        // Imprime el menu por pantalla

        printf("\nElige una opcion:\n");
        printf("a) comprobar si es un impar o esta entre 10 y 100\n");
        printf("b) comprobar si es una letra mayuscula\n");
        printf("c) Cara cruz\n");
        printf("d) Salir\n");
        scanf("\n%c", &opcion);

        // Lo que hace cada opciones del menu
        switch (opcion)
        {
        case 'a':
            printf("\nDame un numero: ");
            scanf("%i", &numero);

            if (numero % 2 == 1 || (numero >= 10 && numero <= 100))
            {
                printf("\n%i si satisface las condiciones.\n", numero);
            }
            else
            {
                printf("\n%i no satisface las condiciones.\n", numero);
            }

            break;
        case 'b':
            printf("\nDame una letra: ");
            scanf("\n%c", &letra);

            if (letra >= 65 && letra <= 90)
            {
                printf("\n%c SI es una mayuscula\n", letra);
            }
            else
            {
                printf("\n%c NO es una mayuscula\n", letra);
            }
            break;
        case 'c':
            printf("\nHa salido %s", (rand() % 2 == 0) ? "CARA" : "CRUZ\n");
            break;
        case 'd':
            printf("\nAdios!\n");
            finalizar = 1;
            break;
        default:
            printf("\nEsa opcion no es valida\n");
        }
    }
    return 0;
}
