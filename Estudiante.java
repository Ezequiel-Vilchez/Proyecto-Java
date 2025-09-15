import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private ArrayList<Materia> materias;
    private Universidad universidad;  // Nuevo atributo

    public Estudiante() {
        materias = new ArrayList<>();
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCarrera(carrera);
        setPromedio(promedio);
        materias = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println(" Nombre inválido.");
        }
    }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println(" Apellido inválido.");
        }
    }

    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad > 16) {
            this.edad = edad;
        } else {
            System.out.println(" Edad inválida. Debe ser mayor a 16.");
        }
    }

    public String getCarrera() { return carrera; }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() { return promedio; }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println(" Promedio inválido. Debe estar entre 0 y 10.");
        }
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public double calcularPromedio() {
        if (materias.isEmpty()) return 0;

        double suma = 0;
    for (int i = 0; i < materias.size(); i++) {
        suma += materias.get(i).getCalificacion();
    }

        return suma / materias.size();
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    

    public void setUniversidad(Universidad universidad) {
    this.universidad = universidad;
}

    public Universidad getUniversidad() {
    return universidad;
    }
}

