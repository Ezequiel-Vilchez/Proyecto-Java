import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    
    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

   
    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    
    public void listarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.getNombre() + " " + e.getApellido());
            System.out.println("Edad: " + e.getEdad());
            System.out.println("Carrera: " + e.getCarrera());
            System.out.println("Promedio: " + e.getPromedio());
            

            System.out.println("Materias:");
            for (Materia m : e.getMaterias()) {
                System.out.println(" - " + m.getNombre() + " (" + m.getCodigo() + "), Nota: " + m.getCalificacion());
            }
        }
    }

    
    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
