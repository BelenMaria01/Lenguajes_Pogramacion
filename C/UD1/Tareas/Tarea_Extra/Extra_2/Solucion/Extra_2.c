#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    // Variable para los numeros y signo aleatorio
    int operador1, operador2;
    char signo;

    // Variables para operaciones
    int aux, resultado, respuesta;

    // Variable para las notas
    int nota=0;


    srand(time(NULL)); // Cada numero random, sera diferente

    printf("Examen de aritmetica basica - 3er Primaria");
    printf("\n------------------------------------------");

    for (int i = 1; i <= 10; i++)
    {
        // Seleciona los numeros aleatorio
        operador1 = rand() % 11;
        operador2 = rand() % 11;

        // Hacemos un menu aleatorio
        switch (rand() % 3)
        {
        case 0:
            signo = '+';
            resultado = operador1 + operador2;
            break;
        case 1:
            signo = '-';

            // Evito los numeros negativo, lo que hago es con el auxiliar, cambiar los valores que da operador 2 si es mayor que operador 1
            if (operador2 > operador1)
            {
                aux = operador1;
                operador1 = operador2;
                operador2 = aux;
            }
            resultado = operador1 - operador2;
            break;
        case 2:
            signo = '*';
            resultado = operador1 * operador2;
            break;
        default:
            break;
        }
        // Aqui nos muestra las operaciones y donde
        printf("\n%i %c %i = ", operador1, signo, operador2);
        scanf("%i", &respuesta);

        // Si la respuesta es negativa, abandona 
        if(respuesta < 0){
            break;
        }
    }

    return 0;
}