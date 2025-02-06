package espoch.edu.ec.newproyectmvcdom.Controlador;

import espoch.edu.ec.newproyectmvcdom.Modelo.Modelo;
import espoch.edu.ec.newproyectmvcdom.Vista.Vista;  

public class Controlador {
    private GestorTarea gestor;
    private Vista vista;

    public Controlador(GestorTarea gestor, Vista vista) {
        this.gestor = gestor;
        this.vista = vista;
    }
    //comentario

    public void ejecutar() {
        
        boolean salir = false;
        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    String titulo = vista.pedirTitulo();
                    String descripcion = vista.pedirDescripcion();
                    gestor.agregarTarea(titulo, descripcion);
                    vista.mostrarMensaje("Tarea agregada con éxito.");
                    break;

                case 2:
                    vista.mostrarMensaje("\nTAREAS PENDIENTES:");
                    vista.mostrarTareas(gestor.listarTareasPendientes());
                    break;

                case 3:
                    vista.mostrarMensaje("\nTAREAS COMPLETADAS:");
                    vista.mostrarTareas(gestor.listarTareasCompletadas());
                    break;

                case 4:
                    int id = vista.pedirIdTarea();
                    if (gestor.marcarComoCompletada(id)) {
                        vista.mostrarMensaje("Tarea marcada como completada.");
                    } else {
                        vista.mostrarMensaje("No se encontró la tarea con ese ID.");
                    }
                    break;

                case 5:
                    salir = true;
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;

                default:
                    vista.mostrarMensaje("Opción no válida, intente de nuevo.");
            }
        }
    }
}
