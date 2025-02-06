/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.newproyectmvcdom.Controlador;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
class GestorTareas {

    void agregarTarea(String titulo, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean marcarComoCompletada(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public List<Tarea> listarTareasPendientes() {
        List<Tarea> tareasPendientes = new ArrayList<>();
        Iterable<Tarea> tareas = null;
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                tareasPendientes.add(tarea);
            }
        }
        return tareasPendientes;
    }
}
