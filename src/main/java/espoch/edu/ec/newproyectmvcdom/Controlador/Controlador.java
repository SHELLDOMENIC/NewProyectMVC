
package espoch.edu.ec.newproyectmvcdom.Controlador;

import espoch.edu.ec.newproyectmvcdom.Vista.Vista;

    
    public class Controlador {
    //lineas de coneccion con vista 
  private Vista vista; 
  private GestorTarea modelo;

    public Controlador(Vista vista, GestorTarea modelo) {
        this.vista = vista;
        //lineas de conexion
        this.modelo = new GestorTarea();
    }
    public void procesoGestorTarea (){
    //si los datos son corectos pasa el modelo, caso contrario los devuelve a la vista
    }
    
}
