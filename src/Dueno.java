public class Dueno {
    private String cedula;
    private String nombre;

    public Dueno() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueno(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
}
