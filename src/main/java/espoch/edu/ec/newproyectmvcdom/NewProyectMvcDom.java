
package espoch.edu.ec.newproyectmvcdom;

import espoch.edu.ec.newproyectmvcdom.Controlador.Controlador;
import espoch.edu.ec.newproyectmvcdom.Modelo.GestorTareas;
import espoch.edu.ec.newproyectmvcdom.Modelo.Tarea;
import espoch.edu.ec.newproyectmvcdom.Vista.Vista;
import java.util.Scanner;

/**
 *
 * @author and_j
 */
public class NewProyectMvcDom {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
       // Crear el modelo (gestor de tareas)
        GestorTareas gestor = new GestorTareas();
        
        // Crear la vista (interfaz gráfica)
        Vista vista = new Vista();
        // Crear el controlador (conectar vista y modelo)
        Controlador controlador = new  Controlador(gestor,vista);
        
        // Crear un usuario con una tarea asignada
        Usuario usuario = new Usuario(1, "Juan Perez");
        Tarea tarea = new Tarea(1, "Estudiar Java", "Revisar patrones de diseño", false);
        usuario.agregarTarea(tarea);
        
        // Iniciar el programa (mostrar la interfaz)
        controlador.ejecutar();
    }
    private Scanner scanner;
}       
