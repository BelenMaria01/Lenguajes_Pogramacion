/*
 * 6am - 11am -> Buenos dias
 * 12pm - 18pm -> Buenas tardes
 * 19pm - 24 pm -> Buenas noches
 * 0am - 6am -> Durmiendo
 */

let horaDia = 12;
let mensaje;

if (horaDia >= 6 && horaDia <= 11) {
  mensaje = "Buenos dias";
} else if (horaDia >= 12 && horaDia <= 18) {
  mensaje = "Buenos tardes";
} else if (horaDia >= 19 && horaDia <= 24) {
  mensaje = "Buenos noches";
} else if (horaDia >= 0 && horaDia < 6) {
  mensaje = "Durmiendo";
} else {
  mensaje = "Error, no es una hora";
}
console.log(mensaje);
