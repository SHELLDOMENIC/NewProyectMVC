
package espoch.edu.ec.newproyectmvcdom.Modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author and_j
 */
public class GestorTareas {
    
    private  List<Tarea> tareas;
    private int contadorId;

    public GestorTareas(List<Tarea> tareas, int contadorId) {
        this.tareas = tareas;
        this.contadorId = 1;
    }

    public void AgregarTareas(String titulo, String descripcion){
        Tarea nuevaTarea = new Tarea(contadorId++, titulo, descripcion);
        tareas.add(nuevaTarea);
    }
    
  
    
    public List<Tarea> ListarTareasPendientes(){
        List<Tarea> pendientes = new ArrayList();
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                pendientes.add(tarea);
            }
        }
        return pendientes;
    }
   
   
     public boolean MarcarComoCompletada(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.MarcarComoCompletada();
                return true;
            }
        }
        return false;
    }
}
    






