public class Asignatura {
<<<<<<< HEAD

    private int codigo;
    private String nombre;
    private int creditos;
    private String profesor;    

    //Constructor
    public Asignatura(int codigo, String nombre, int creditos, String profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
    }
    
    //Getters y Setters
    protected int getCodigo() {
        return this.codigo;
    }   
    
    protected void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
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
    protected String getProfesor() {
        return this.profesor;       
    }   

    protected void setProfesor(String profesor) {
        this.profesor = profesor;       
    }


     //toString
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", creditos=" + creditos + ", profesor=" + profesor + '}';
    }


=======
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
     //toString
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", creditos=" + creditos + '}';
    }

    
>>>>>>> ad0ac4dc6a0f4b4c2628f5bc155c7e7bf660e8ed
}
