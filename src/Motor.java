public class Motor {

    private double cilindraje;
    private int numValvulas;
    private String combustible;
    private String serie;

    public Motor() {

    }

// constructores

    public Motor(String serie) {
        this.serie = serie;
    }

    public Motor(double cilindraje, int numValvulas, String combustible) {
        this.cilindraje = cilindraje;
        this.numValvulas = numValvulas;
        this.combustible = combustible;
    }


    double fuerza() {
        double fuerzaNum = 0;
        if (combustible.equals("Gasolina")) {
            fuerzaNum = cilindraje * numValvulas;
        } else if (combustible.equals("Diesel")) {
            fuerzaNum = cilindraje * numValvulas * 1.5;
        }

        return fuerzaNum;

    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }


    public int getNumValvulas() {
        return numValvulas;
    }

    public void setNumValvulas(int numValvulas) {
        this.numValvulas = numValvulas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;


    }

}