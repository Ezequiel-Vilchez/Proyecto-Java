public class App {
    public static void main(String[] args) {
        // Crear carrera
        Carrera carrera = new Carrera("Programador Universitario");

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Cristian", "Caceres", 20, "Programador Universitario");
        Estudiante e2 = new Estudiante("Alejandro", "Rodriguez", 22, "Programador Universitario");
        Estudiante e3 = new Estudiante("Ezequiel", "Vilchez", 20, "Programador Universitario");

        // Crear materias
        Materia m1 = new Materia("Matemáticas", "MAT101", 4, 8.5);
        Materia m2 = new Materia("Programación", "PRG202", 5, 9.0);
        Materia m3 = new Materia("Bases de Datos", "BD303", 4, 7.5);

        // Asignar materias a estudiantes
        e1.agregarMateria(m1);
        e1.agregarMateria(m2);

        e2.agregarMateria(m2);
        e2.agregarMateria(m3);

        e3.agregarMateria(m1);
        e3.agregarMateria(m3);

        // Agregar estudiantes a la carrera
        carrera.agregarEstudiante(e1);
        carrera.agregarEstudiante(e2);
        carrera.agregarEstudiante(e3);

        // Listar estudiantes de la carrera
        System.out.println("Estudiantes de la carrera " + carrera.getNombre() + ":");
        carrera.listarEstudiantes();

        // Buscar estudiante
        Estudiante buscado = carrera.buscarEstudiante("Cristian");
        if(buscado != null) {
            System.out.println("\nEstudiante encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
            System.out.println("Materias inscritas:");
            buscado.listarMaterias();
        }
    }
}
