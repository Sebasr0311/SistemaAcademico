import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    static ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== SISTEMA ACADEMICO =====");
            System.out.println("1. Gestionar Estudiantes");
            System.out.println("2. Gestionar Asignaturas");
            System.out.println("3. Gestionar Notas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: menuEstudiantes(); break;
                case 2: menuAsignaturas(); break;
                case 3: menuNotas(); break;
                case 0: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }
    static void menuEstudiantes() {

        int opcion;

        do {
            System.out.println("\n--- CRUD ESTUDIANTES ---");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("4. Editar");
            System.out.println("5. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: registrarEstudiante(); break;
                case 2: listarEstudiantes(); break;
                case 3: buscarEstudiante(); break;
                case 4: editarEstudiante(); break;
                case 5: eliminarEstudiante(); break;
            }

        } while (opcion != 0);
    }

    static void registrarEstudiante() {

        System.out.println("Codigo:");
        String codigo = sc.nextLine();

        if (buscarPorCodigo(codigo) != null) {
            System.out.println("Ya existe un estudiante con ese codigo");
            return;
        }

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Apellido:");
        String apellido = sc.nextLine();

        System.out.println("Edad:");
        int edad = sc.nextInt();

        if (edad <= 0) {
            System.out.println("Edad invalida");
            sc.nextLine();
            return;
        }

        System.out.println("Semestre:");
        int semestre = sc.nextInt();

        if (semestre <= 0) {
            System.out.println("Semestre invalido");
            sc.nextLine();
            return;
        }

        sc.nextLine();

        Estudiante e = new Estudiante(codigo, nombre, apellido, edad, semestre);
        listaEstudiantes.add(e);

        System.out.println("Estudiante registrado correctamente");
    }

    static void editarEstudiante() {

        System.out.println("Codigo del estudiante a editar:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if (e == null) {
            System.out.println("Estudiante no existe");
            return;
        }

        System.out.println("Nuevo nombre:");
        e.setNombre(sc.nextLine());

        System.out.println("Nuevo apellido:");
        e.setApellido(sc.nextLine());

        System.out.println("Nueva edad:");
        int nuevaEdad = sc.nextInt();

        if (nuevaEdad <= 0) {
            System.out.println("Edad invalida");
            sc.nextLine();
            return;
        }

        System.out.println("Nuevo semestre:");
        int nuevoSemestre = sc.nextInt();

        if (nuevoSemestre <= 0) {
            System.out.println("Semestre invalido");
            sc.nextLine();
            return;
        }

        sc.nextLine();

        e.setEdad(nuevaEdad);
        e.setSemestre(nuevoSemestre);

        System.out.println("Estudiante actualizado correctamente");
    }

    static void listarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
            return;
        }

        for (Estudiante e : listaEstudiantes) {
            System.out.println(e);
            System.out.println("------------------------");
        }
    }

    static void eliminarEstudiante() {

        System.out.println("Codigo del estudiante a eliminar:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if (e == null) {
            System.out.println("No existe");
            return;
        }

        listaEstudiantes.remove(e);
        System.out.println("Estudiante eliminado correctamente");
    }

    static Estudiante buscarPorCodigo(String codigo) {

        for (Estudiante e : listaEstudiantes) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;
    }

    static void buscarEstudiante() {

        System.out.println("Codigo a buscar:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if (e == null) {
            System.out.println("Estudiante no encontrado");
        } else {
            System.out.println(e);
        }
    }


    static void menuAsignaturas() {

        int opcion;

        do {
            System.out.println("\n--- CRUD ASIGNATURAS ---");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: registrarAsignatura(); break;
                case 2: listarAsignaturas(); break;
                case 3: eliminarAsignatura(); break;
            }

        } while (opcion != 0);
    }

    static void registrarAsignatura() {

        System.out.println("Nombre de la asignatura:");
        String nombre = sc.nextLine();

        if (buscarAsignatura(nombre) != null) {
            System.out.println("La asignatura ya existe");
            return;
        }

        System.out.println("Creditos:");
        int creditos = sc.nextInt();

        if (creditos <= 0) {
            System.out.println("Creditos invalidos");
            sc.nextLine();
            return;
        }

        sc.nextLine();

        Asignatura a = new Asignatura(nombre, creditos);
        listaAsignaturas.add(a);

        System.out.println("Asignatura registrada correctamente");
    }

    static void listarAsignaturas() {

        if (listaAsignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas");
            return;
        }

        for (Asignatura a : listaAsignaturas) {
            System.out.println(a);
        }
    }

    static void eliminarAsignatura() {

        System.out.println("Nombre de la asignatura a eliminar:");
        String nombre = sc.nextLine();

        Asignatura a = buscarAsignatura(nombre);

        if (a == null) {
            System.out.println("No existe");
            return;
        }

        listaAsignaturas.remove(a);
        System.out.println("Asignatura eliminada correctamente");
    }

    static Asignatura buscarAsignatura(String nombre) {

        for (Asignatura a : listaAsignaturas) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }

        return null;
    }

    static void menuNotas() {

        int opcion;

        do {
            System.out.println("\nGESTION NOTAS");
            System.out.println("1. Registrar Nota");
            System.out.println("2. Ver Notas de Estudiante");
            System.out.println("3. Editar Nota");
            System.out.println("4. Eliminar Nota");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: registrarNota(); break;
                case 2: verNotasEstudiante(); break;
                case 3: editarNota(); break;
                case 4: eliminarNota(); break;
            }

        } while (opcion != 0);
    }

    static void registrarNota() {

        System.out.println("Codigo del estudiante:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if (e == null) {
            System.out.println("Estudiante no existe");
            return;
        }

        System.out.println("Nombre de la asignatura:");
        String nombreAsignatura = sc.nextLine();

        Asignatura a = buscarAsignatura(nombreAsignatura);

        if (a == null) {
            System.out.println("Asignatura no existe");
            return;
        }

        for (Nota n : e.getNotas()) {
            if (n.getAsignatura().getNombre().equalsIgnoreCase(nombreAsignatura)) {
                System.out.println("Ya existe una nota para esa asignatura");
                return;
            }
        }

        System.out.println("Valor de la nota (0.0 - 5.0):");
        double valor = sc.nextDouble();
        sc.nextLine();

        if (valor < 0.0 || valor > 5.0) {
            System.out.println("La nota debe estar entre 0.0 y 5.0");
            return;
        }

        Nota n = new Nota(valor, a);
        e.agregarNota(n);

        System.out.println("Nota registrada correctamente");
    }

    static void verNotasEstudiante() {

        System.out.println("Codigo del estudiante:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if (e == null) {
            System.out.println("Estudiante no existe");
            return;
        }

        if (e.getNotas().isEmpty()) {
            System.out.println("No tiene notas registradas");
            return;
        }

        for (Nota n : e.getNotas()) {
            System.out.println(n);
        }
    }

    static void editarNota() {

        System.out.println("Codigo del estudiante:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if (e == null) {
            System.out.println("Estudiante no existe");
            return;
        }

        if (e.getNotas().isEmpty()) {
            System.out.println("No tiene notas registradas");
            return;
        }

        for (int i = 0; i < e.getNotas().size(); i++) {
            System.out.println(i + " - " + e.getNotas().get(i));
        }

        System.out.println("Seleccione el numero de la nota a editar:");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice < 0 || indice >= e.getNotas().size()) {
            System.out.println("Indice invalido");
            return;
        }

        System.out.println("Nuevo valor (0.0 - 5.0):");
        double nuevoValor = sc.nextDouble();
        sc.nextLine();

        if (nuevoValor < 0.0 || nuevoValor > 5.0) {
            System.out.println("La nota debe estar entre 0.0 y 5.0");
            return;
        }

        e.getNotas().get(indice).setValor(nuevoValor);

        System.out.println("Nota actualizada correctamente");
    }

    static void eliminarNota() {

        System.out.println("Codigo del estudiante:");
        String codigo = sc.nextLine();

        Estudiante e = buscarPorCodigo(codigo);

        if (e == null) {
            System.out.println("Estudiante no existe");
            return;
        }

        if (e.getNotas().isEmpty()) {
            System.out.println("No tiene notas");
            return;
        }

        for (int i = 0; i < e.getNotas().size(); i++) {
            System.out.println(i + " - " + e.getNotas().get(i));
        }

        System.out.println("Seleccione el numero de la nota a eliminar:");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice < 0 || indice >= e.getNotas().size()) {
            System.out.println("Indice invalido");
            return;
        }

        e.getNotas().remove(indice);

        System.out.println("Nota eliminada correctamente");
    }
}