import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private List<Estudiante> estudiantes;

    
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new ArrayList<>();
    }

   
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

   
    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void listarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " " + e.getApellido());
        }
    }
}