public class Motor {

    int cilindraje;
    int numValvulas;
    String combustible;

    public Motor() {

    }

    public Motor(int cilindraje, int numValvulas, String combustible) {
        this.cilindraje = cilindraje;
        this.numValvulas = numValvulas;
        this.combustible = combustible;
    }

    double fuerza(){
        double fuerzaNum=0;
        if (combustible.equals("Gasolina")){
            fuerzaNum=cilindraje*numValvulas;
        }else if (combustible.equals("Diesel")){
            fuerzaNum=cilindraje*numValvulas*1.5;
        }

        return fuerzaNum;

    }

}
