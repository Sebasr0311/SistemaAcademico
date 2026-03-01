public class Nota {

    private double valor;
    private Asignatura asignatura;


    public Nota(double valor, Asignatura asignatura) {
        this.valor = valor;
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Nota" +
                "\nValor: " + valor +
                "\nAsignatura: " + asignatura.getNombre();
    }
}