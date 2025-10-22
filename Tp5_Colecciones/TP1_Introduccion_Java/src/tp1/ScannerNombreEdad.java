/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author mfarf
 */
public class ScannerNombreEdad {
    public static void main(String[] args) {
        //Se crea el Scanner para poder leer por pantalla
        Scanner input = new Scanner(System.in);
        
        //declaramos las variables
        String nombre;
        int edad;
        
        //se solicitan los datos
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        
        //se muestran en pantalla
        System.out.println("");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    
    }
}
