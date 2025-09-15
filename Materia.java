public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;

    public Materia() {}

    public Materia(String nombre, String codigo, int creditos, double calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        }
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        if(creditos > 0) {
            this.creditos = creditos;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if(calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        }
    }
}
