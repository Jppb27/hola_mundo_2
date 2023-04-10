// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            // dueño 1
        Dueno dueno1=new Dueno("1753921384","Juan");
        Motor motor1=new Motor(2000,5,"Gasolina");
        Auto auto=new Auto("Blanco",5,"PHJ789","JS4",4,motor1,dueno1);
            // dueño 2
        Dueno dueno2=new Dueno("1711128890","Jorge");
        Motor motor2=new Motor(1600,6,"Diesel");
        Auto auto1=new Auto("Gris",4,"HCI8951","Yaris GR",4,motor2,dueno2);
            // dueño 3
    Dueno dueno3=new Dueno("1784563278","Leon");
    Motor motor3=new Motor(4000,8,"Diesel");
    Auto auto3=new Auto("Ocre",5,"KLM7895","Amarok",4,motor3,dueno3);
    auto.setColor("Blanco");
    String coloraux=auto.getColor();

    }
}