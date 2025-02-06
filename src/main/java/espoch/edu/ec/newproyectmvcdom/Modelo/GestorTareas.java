
package espoch.edu.ec.newproyectmvcdom.Modelo;

/**
 *
 * @author and_j
 */
public class GestorTareas {
    private Tarea tareas;
    String[] ListTareas = new String[1000];

    public GestorTareas(Tarea tareas) {
        this.tareas = tareas;
    }

    public GestorTareas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public  String AgregarTareas(Tarea tareas){
    return "";
    }
    public String ListarTareasPendientes(){
    return "";
    }
    public String ListarTareasCompletadas(){
    return "";
    }
    public String MarcarComoCompletada(int id){
    return "";
    }
}
