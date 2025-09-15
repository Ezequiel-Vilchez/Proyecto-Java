public class App {
    public static void main(String[] args) {
        // Crear universidad
        Universidad u = new Universidad("Unvime", "Los Poetas");

        System.out.println("Universidad: " + u.getNombre());
        System.out.println("Dirección: " + u.getDireccion());

        // Crear materias
        Materia m1 = new Materia("Matemática", "MAT101", 4, 9.0);
        Materia m2 = new Materia("Programación", "PRG102", 5, 8.0);
        Materia m3 = new Materia("Inglés", "ING103", 3, 7.0);

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Ezequiel", "Vilchez", 20, "Programador Universitario", 9);
        Estudiante e2 = new Estudiante("Roberto", "Lopez", 22, "Ingeniería", 8);

        // Asignar materias a estudiantes
        e1.agregarMateria(m1);
        e1.agregarMateria(m2);

        e2.agregarMateria(m1);
        e2.agregarMateria(m3);

        // Calcular promedios
        double promedioE1 = e1.calcularPromedio();
        double promedioE2 = e2.calcularPromedio();

        // Asignar la universidad
        u.agregarEstudiante(e1);
        u.agregarEstudiante(e2);

        // Crear carrera y agregar estudiantes
        Carrera carrera = new Carrera("Programación");
        carrera.agregarEstudiante(e1);
        carrera.agregarEstudiante(e2);

        // Mostrar datos
        System.out.println("\nEstudiantes de la carrera " + carrera.getNombre() + ":");
        carrera.listarEstudiantes();

        // Buscar estudiante
        Estudiante buscado = carrera.buscarEstudiante("Roberto");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
        }

        // Mostrar promedios de cada estudiante
        System.out.println("\nPromedios de estudiantes:");
        System.out.println(e1.getNombre() + " " + e1.getApellido() + ": " + promedioE1);
        System.out.println(e2.getNombre() + " " + e2.getApellido() + ": " + promedioE2);
    }
}
