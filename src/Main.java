
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    static ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
    static ArrayList<Nota> listaNotas = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("CRUD ESTUDIANTES");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("4. Editar");
            System.out.println("5. Eliminar");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: registrar(); break;
                case 2: listar(); break;
                case 3: buscar(); break;
                case 4: editar(); break;
                case 5: eliminar(); break;
                case 0: System.out.println("Adios"); break;
                default: System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }

    static void registrar() {

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
        sc.nextLine();

        Estudiante e = new Estudiante();
        e.setCodigo(codigo);
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setEdad(edad);
        e.setSemestre(semestre);

        listaEstudiantes.add(e);
        System.out.println(" Registrado");
    }

    static void listar() {
        if(listaEstudiantes.isEmpty()){
            System.out.println("No hay estudiantes");
            return;
        }

        for(Estudiante e : listaEstudiantes){
            System.out.println(e);
            System.out.println("----------------");
        }
    }

    static Estudiante buscarPorCodigo(String codigo){
        for(Estudiante e : listaEstudiantes){
            if(e.getCodigo().equals(codigo)){
                return e;
            }
        }
        return null;
    }

    static void buscar(){
        System.out.println("Codigo a buscar:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if(e == null){
            System.out.println("No encontrado");
        }else{
            System.out.println(e);
        }
    }

    static void editar(){
        System.out.println("Codigo del estudiante a editar:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if(e == null){
            System.out.println("No existe");
            return;
        }

        System.out.println("Nuevo nombre:");
        e.setNombre(sc.nextLine());

        System.out.println("Nuevo apellido:");
        e.setApellido(sc.nextLine());

        System.out.println("Nueva edad:");
        e.setEdad(sc.nextInt());
        sc.nextLine();

        System.out.println("Nuevo semestre:");
        e.setSemestre(sc.nextInt());
        sc.nextLine();

        System.out.println("Actualizado");
    }

    static void eliminar(){
        System.out.println("Codigo a eliminar:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if(e == null){
            System.out.println("No existe");
            return;
        }

        listaEstudiantes.remove(e);
        System.out.println("Eliminado");
    }

    static void registrarAsignatura() {
        System.out.println("Codigo:");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Creditos:");
        int creditos = sc.nextInt();
        sc.nextLine();

        System.out.println("Profesor:");
        String profesor = sc.nextLine();

        Asignatura a = new Asignatura(codigo, nombre, creditos, profesor);
        listaAsignaturas.add(a);

        System.out.println("Asignatura registrada");
    }

    static void listarAsignaturas() {
        if(listaAsignaturas.isEmpty()){
            System.out.println("No hay asignaturas");
            return;
        }

        for(Asignatura a : listaAsignaturas){
            System.out.println(a);
        }
    }

    static void buscarAsignatura(){
        if(listaAsignaturas.isEmpty()){
            System.out.println("No hay asignaturas registradas");
            return;
        }

        System.out.println("Codigo de la asignatura:");
        int codigo = sc.nextInt();
        sc.nextLine();

        for(Asignatura a : listaAsignaturas){
            if(a.getCodigo() == codigo){
                System.out.println(a);
                return;
            }
        }
        System.out.println("Asignatura no encontrada");
    }

    static void actualizarAsignatura(){
        if(listaAsignaturas.isEmpty()){
            System.out.println("No hay asignaturas registradas");
            return;
        }

        System.out.println("Codigo de la asignatura a actualizar:");
        int codigo = sc.nextInt();
        sc.nextLine();

        for(Asignatura a : listaAsignaturas){
            if(a.getCodigo() == codigo){

                System.out.println("Nuevo nombre:");
                a.setNombre(sc.nextLine());

                System.out.println("Nuevos creditos:");
                a.setCreditos(sc.nextInt());
                sc.nextLine();

                System.out.println("Nuevo profesor:");
                a.setProfesor(sc.nextLine());

                System.out.println("Asignatura actualizada");
                return;
            }
        }
        System.out.println("Asignatura no encontrada");
    }

    //CREATE
    public void registrarNota(){
        System.out.println("Codigo del estudiante:");
        var codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if(e == null){
            System.out.println("No existe");
            return;
        }

        System.out.println("Nombre de la asignatura:");
        var nombreAsignatura = sc.nextLine();

        System.out.println("Creditos:");
        var creditos = sc.nextInt();
        sc.nextLine();

        Asignatura a = new Asignatura(creditos, nombreAsignatura);

        System.out.println("Valor de la nota:");
        var valorNota = sc.nextDouble();
        sc.nextLine();

        System.out.println("Periodo:");
        var periodo = sc.nextLine();
        Nota nota = new Nota(valorNota, periodo, a);
        nota.setValor(valorNota);
        nota.setPeriodo(periodo);
        nota.setAsignatura(a);
        
        listaNotas.add(nota);
        System.out.println("Nota registrada");
        
    }
    //READ
    public void listarNotas(){
        if(listaNotas.isEmpty()){
            System.out.println("No hay notas");
            return;
        }

        for(Nota n : listaNotas){
            System.out.println(n);
            System.out.println("----------------");
        }
    }

    public void buscarNota(){
        System.out.println("Codigo del estudiante:");
        var codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if(e == null){
            System.out.println("No existe");
            return;
        }

        System.out.println("Nombre de la asignatura:");
        var nombreAsignatura = sc.nextLine();

        for(Nota n : listaNotas){
            if(n.getAsignatura().getNombre().equals(nombreAsignatura)){
                System.out.println(n);
                return;
            }
        }

        System.out.println("No encontrado");
    }
    //UPDATE
    public void actualizarNota(){
        System.out.println("Codigo del estudiante:");
        var codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if(e == null){
            System.out.println("No existe");
            return;
        }

        System.out.println("Nombre de la asignatura:");
        var nombreAsignatura = sc.nextLine();

        for(Nota n : listaNotas){
            if(n.getAsignatura().getNombre().equals(nombreAsignatura)){
                System.out.println("Nuevo valor de la nota:");
                n.setValor(sc.nextDouble());
                sc.nextLine();
                System.out.println("Nota actualizada");
                return;
            }
        }

        System.out.println("No encontrado");
    }
    //DELETE
    public void eliminarNota(){
        System.out.println("Codigo del estudiante:");
        var codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if(e == null){
            System.out.println("No existe");
            return;
        }

        System.out.println("Nombre de la asignatura:");
        var nombreAsignatura = sc.nextLine();

        for(Nota n : listaNotas){
            if(n.getAsignatura().getNombre().equals(nombreAsignatura)){
                listaNotas.remove(n);
                System.out.println("Nota eliminada");
                return;
            }
        }

        System.out.println("No encontrado");
    }   
    

}