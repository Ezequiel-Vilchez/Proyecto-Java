import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void listarEstudiantes() {
        for(Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - Promedio: " + e.calcularPromedio());
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        for(Estudiante e : estudiantes) {
            if(e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}
