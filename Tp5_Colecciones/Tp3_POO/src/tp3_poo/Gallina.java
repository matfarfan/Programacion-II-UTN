/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author mfarf
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void ponerHuevos(){
        huevosPuestos++;
    }
    
    public void envejecer() {
        edad++;
    }
    
    public void mostrarEstado() {
            System.out.println("Gallina: " + idGallina + "\nEdad: " + edad + "\nHuevos: " + huevosPuestos);
    }
}
