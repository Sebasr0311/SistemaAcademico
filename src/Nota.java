public class Nota {
    
    private double valor;
    private Asignatura asignatura;
    //toString
    @Override
    public String toString() {  
        return "Nota{" + "valor=" + valor + ", asignatura=" + asignatura + '}';
    }
    //getters y setters
    protected double getValor() {   
        return this.valor;
    }   
    protected void setValor(double valor) {
        this.valor = valor;
    }
    protected Asignatura getAsignatura() {
        return this.asignatura;
    }
    protected void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
}
