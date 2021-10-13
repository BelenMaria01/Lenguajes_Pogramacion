let a = 3,
  b = 2,
  c = 1,
  d = 4;

let resu = a * b + c / d; // a * b = X c / d = Y X+Y = resultado ( 6.25 )
console.log(resu);

resu = c + a * b / d; // a * b = X X /d = Y c + Y = resultado ( 2.5 )
console.log(resu);

// * Es recomendable poner parentesis para priorizar
// * para el segundo resu seria c * (a*b) / d
