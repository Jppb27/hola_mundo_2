public class Auto {
    String color;
    int puertas;
    String placas;
    String modelo;
    int numLlantas;

    Motor motor;
    Dueno dueno;
    public Auto(){

}
public Auto(String color,int puertas,String placas, String modelo, int numLlantas,Motor motor, Dueno dueno){
        this.color=color;
        this.puertas=puertas;
        this.placas=placas;
        this.modelo=modelo;
        this.numLlantas=numLlantas;
        this.motor=motor;
        this.dueno=dueno;
}

    public Auto(String color, int puertas, String placas) {
        this.color = color;
        this.puertas = puertas;
        this.placas = placas;
    }

    double velocidad(){
    double velocidadKh=0;
    velocidadKh=motor.fuerza()*numLlantas;
    return velocidadKh;
}
}
