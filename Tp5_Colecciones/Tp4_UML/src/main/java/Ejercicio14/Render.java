/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author mfarf
 */
public class Render {
    private String formato;
    private Proyecto proyecto; // asociación unidireccional: Render → Proyecto

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato; 
    }
    
    public Proyecto getProyecto() {
        return proyecto; 
    }

    public void mostrar() {
        System.out.println("Render en formato " + formato + " del proyecto '" +
                proyecto.getNombre() + "' (" + proyecto.getDuracionMin() + " min)");
    }
}
