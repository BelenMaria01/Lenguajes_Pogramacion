let miNumero = "18x";

let edad = Number(miNumero);
console.log(edad);

if (isNaN(edad)) {
  console.log("No es un numero");
} else if (edad >= 18) {
  console.log("Puede votar");
} else {
  let resu = edad >= 18 ? "puede votar" : "muy joven para votar";
  console.log(resu);
}