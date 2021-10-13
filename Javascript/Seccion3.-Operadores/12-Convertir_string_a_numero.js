let miNumero = "10";
console.log(typeof miNumero);

// * Se transforma el variable string miNumero 
let edad = Number(miNumero);
console.log(typeof edad);

if (edad>=18){
    console.log("Puede votar");
}else{
    console.log("Muy joven para votar");
}

// * Ternario
let resu = (edad >= 18) ? "puede votar" : "muy joven para votar";
console.log(resu);

