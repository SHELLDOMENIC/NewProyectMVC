
package espoch.edu.ec.newproyectmvcdom.Modelo;

/**
 *
 * @author and_j
 */
public class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private boolean Completada;

    public Tarea(int id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.Completada = Completada;
    }

    public Tarea(int i, String estudiar_Java, String revisar_patrones_de_diseño, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return Completada;
    }

    public void setCompletada(boolean Completada) {
        this.Completada = Completada;
    }
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + Completada +
                '}';
    }
}
