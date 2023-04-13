import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            // dueño 1
        Dueno dueno1=new Dueno("1753921384","Juan");
        Motor motor1=new Motor(2000,5,"Gasolina");
        Auto auto=new Auto("Blanco",5,"PHJ789","JS4",4,motor1,dueno1);
        auto.imprimirAttr();
        System.out.println("******************************");
            // dueño 2
        Dueno dueno2=new Dueno("1711128890","Jorge");
        Motor motor2=new Motor(1600,6,"Diesel");
        Auto auto1=new Auto("Gris",4,"HCI8951","Yaris GR",4,motor2,dueno2);
            // dueño 3
    Dueno dueno3=new Dueno("1784563278","Leon");
    Motor motor3=new Motor(4000,8,"Diesel");
    Auto auto3=new Auto("Ocre",5,"KLM7895","Amarok",4,motor3,dueno3);
    //

        Scanner sc= new Scanner(System.in);


        System.out.println("Ingrese la placa del auto: ");
        String placa=sc.next();
        System.out.println("Ingrese el año del auto: ");
        int anio=sc.nextInt();
        System.out.println("Ingrese el modelo del auto: ");
        String modelo=sc.next();
        System.out.println("Ingrese el combustible del auto: ");
        String combustible=sc.next();
        System.out.println("Ingrese el cilindraje del auto: ");
        double ncilindraje=sc.nextDouble();


        auto1.setModelo(modelo);
        auto1.setPlacas(placa);
        auto1.setAnio(anio);
        auto1.setModelo(modelo);
        auto1.getMotor().setCombustible(combustible);
        auto1.getMotor().setCilindraje(ncilindraje);
        auto1.imprimirAttr();




    auto1.setColor("Blanco");
    String coloraux=auto.getColor();

    auto3.getMotor().setCombustible("Gasolina");
    auto3.getDueno().setNombre("Sauron");
    // marca placa
        // impresion de datos por consola




    }
}