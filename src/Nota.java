public class Nota {
    
    private double valor;
    private String periodo;
    private Asignatura asignatura;

    //Constructor
    public Nota(double valor, String periodo, Asignatura asignatura) {
        this.valor = valor;
        this.periodo = periodo; 
        this.asignatura = asignatura;
    }

    //getters y setters
    protected double getValor() {   
        return this.valor;
    }   
    protected void setValor(double valor) {
        this.valor = valor;
    }
    protected String getPeriodo() {
        return this.periodo;
    }
    protected void setPeriodo(String periodo) {
        this.periodo = periodo;
    }   

    protected Asignatura getAsignatura() {
        return this.asignatura;
    }
    protected void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
       //toString
    @Override
    public String toString() {  
        return "Nota{" + "valor=" + valor + ", periodo=" + periodo + ", asignatura=" + asignatura + '}';
    }
}
