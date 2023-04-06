public class Auto {
    String color;
    int puertas;
    String placas;
    String modelo;
    int numLlantas;

Motor motor;
double velocidad(){
    double velocidadKh=0;
    velocidadKh=motor.fuerza()*numLlantas;
    return velocidadKh;
}
}
