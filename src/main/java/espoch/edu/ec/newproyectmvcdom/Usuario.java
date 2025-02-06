
package espoch.edu.ec.newproyectmvcdom;

import espoch.edu.ec.newproyectmvcdom.Modelo.Tarea;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author and_j
 */
class Usuario {
    private int id;
    private String nombre;
    private  String tareas;

    // Constructor corregido
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tareas = tareas;
    }

    // Método corregido para agregar una tarea
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public  String getTareas() {
        return tareas;
    }

    public String getNombre() {
        return nombre;
    }
}
    

