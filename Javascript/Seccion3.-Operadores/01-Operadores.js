let a = 3,
  b = 2;
let resu = a + b;
console.log("Resultado de la suma : " + resu);

resu = a - b;
console.log("Resultado de la resta: " + resu);

resu = a * b;
console.log("Resultado de la multi : " + resu);

resu = a / b;
console.log("Resultado de la div: " + resu);

resu = a % b; //residuo (resto) de la division
console.log("Resultado del operacion modulo (residuo): " + resu);

resu = a ** b; // 3 al cuadrado = 3x3
console.log("Resultado de operador exponente: " + resu);

resu = ++a; //* pre-incremento (el operador ++ antes de la variable)
console.log(a);
console.log(resu);

resu = b++; // * post-incremento ( el operador ++ despues de la variable)
console.log(b);
console.log(resu);

resu = --a; //  * pre-descremento
console.log(a);
console.log(resu);

resu = b--; // * post-decremento
console.log(b);
console.log(resu);
