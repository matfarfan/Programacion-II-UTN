/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author mfarf
 */
public class EditorVideo {
    // Dependencia de CREACIÓN: crea el Render con 'new' y NO lo guarda como atributo
    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto); // <<create>>
        // Se usa localmente (ej. mostrar/enviar/guardar a disco), pero no queda en this
        r.mostrar();
    }
}
