public class Auto {
      private String color;
    private int puertas;
    private String placas;
    private String modelo;
    private int anio;
    private int numLlantas;

    private Motor motor;
   private Dueno dueno;
    public Auto(){

}
// constructores
    public Auto(Motor motor, Dueno dueno) {
        this.motor = motor;
        this.dueno = dueno;
    }

    public Auto(String color, int puertas, String placas, String modelo, int numLlantas, Motor motor, Dueno dueno){
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

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
// fin de los constructores
    //geter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

}
