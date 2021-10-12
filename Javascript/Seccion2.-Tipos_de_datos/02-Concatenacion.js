// * Concatenar o unir dos String

var nombre = "juan";
var apellido = "perez";

var nombreCompleto = nombre + apellido; // asi no tendria espacio (juanperez)

console.log(nombreCompleto);

var nombreCompleto2 = "Carlos" + " " + "Lara";
console.log(nombreCompleto2);

// * Concatenar o unir un String con un numero

var x = nombre + " " + 219;
console.log(x);

x = nombre + " " + 2 + " " + 4; // No se suma
console.log(x);

x = nombre + (2 + 4); // Con el parentesis si se suma
console.log(x);

x = 2 + 4 + nombre;
console.log(x);
