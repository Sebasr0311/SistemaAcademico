public class Asignatura {
    private String nombre;
    private int creditos;

    //Constructor
    public Asignatura(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    //Getters y Setters
    protected String getNombre() {
        return this.nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected int getCreditos() {
        return this.creditos;
    }
    protected void setCreditos(int creditos) {
        this.creditos = creditos;
    }

}
