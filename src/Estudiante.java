public class Estudiante {
    private string codigo;
    private string nombre;
    private string apellido;
    private int edad;
    private int semestre;

    public Estudiante (){

    }

    public Estudiante(String codigo, string nombre, string apellido, int edad, int semestre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
    }

    public string getCodigo() {
        return codigo;
    }

    public void setCodigo(string codigo) {
        this.codigo = codigo;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getApellido() {
        return apellido;
    }

    public void setApellido(string apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
