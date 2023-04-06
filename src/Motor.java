public class Motor {

    int cilindraje;
    int numValvulas;
    String combustible;
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
