/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author mfarf
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
public void mostrarInfo(){
    System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
}

public void cumplirAnios(){
    edad++;
}

}
