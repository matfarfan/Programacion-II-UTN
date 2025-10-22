/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author mfarf
 */
public abstract class Figura {
    protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre; 
    }
    
    public abstract double calcularArea();
    
    public void mostrarArea() {
        System.out.println("Área del " + nombre + ": " + calcularArea());
    }
}