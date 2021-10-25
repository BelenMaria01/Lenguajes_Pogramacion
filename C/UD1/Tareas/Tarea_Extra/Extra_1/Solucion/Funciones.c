#include "Funciones.h"

void Menu()
{
    printf("\nElige una opcion:\n");
    printf("a) comprobar si es un impar o esta entre 10 y 100\n");
    printf("b) comprobar si es una letra mayuscula\n");
    printf("c) Cara cruz\n");
    printf("d) Salir\n");

    return;
}

int DameNumero()
{   
    int numero;
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
    return numero;
}

char DameLetra()
{
    char letra;

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
    return letra;
}

void Aleatorio()
{
    printf("\nHa salido %s", (rand() % 2 == 0) ? "CARA" : "CRUZ\n");
    return;
}

void Salir()
{   
    printf("\nAdios!");
    return;
}