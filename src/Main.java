import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo:");
        String codigo = sc.nextLine();

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Apellido:");
        String apellido = sc.nextLine();

        System.out.println("Edad:");
        int edad = sc.nextInt();

        System.out.println("Semestre:");
        int semestre = sc.nextInt();


        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo(codigo);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setEdad(edad);
        estudiante.setSemestre(semestre);


        listaEstudiantes.add(estudiante);


        for (Estudiante e : listaEstudiantes) {
            System.out.println(e);
        }
    }
}