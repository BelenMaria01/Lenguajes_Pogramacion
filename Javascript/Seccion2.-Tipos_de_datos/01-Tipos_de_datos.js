// * String -> cadenas
var nombre = "Carlos";
console.log(nombre);
nombre = 10.5;
console.log(nombre);

// * Numerico -> entero y decilames
var numero = 1000;
console.log(numero);
var numero2 = 2.3;
console.log(numero2);

// * Objetos -> varios variables
var objeto = {
  nombre: "Juan",
  apellido: "Perez",
  telefono: "123457890",
};
console.log(objeto);

// * Boolean -> verdadero o falso
var bandera = true;
console.log(bandera);

// * Funciones -> nos permite reutilizar lineas de codigo
function miFuncion() {}
console.log(miFuncion);

// * Sysbol -> crea valor unico de una variable
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

// * Clase -> Tambien es una funcion
class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}
console.log(Persona);

// * Undefined -> cuando no definimo un valor o dato
var x;
console.log(x);
x = undefined;
console.log(x);

// * null -> ausencia de valor
var y = null;
console.log(y);

// * Arrays -> arreglos
var autos = ['BMW','AUDI','VOLVO'];
console.log(autos);

// * variales vacios
var z = '';
console.log(z);

