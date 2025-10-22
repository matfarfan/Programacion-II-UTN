/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp.tp2;

import java.util.Scanner;

/**
 *
 * @author mfarf
 */
public class Ejercicio9 {
    public static double calcularCostoEnvio(double peso, String zona){
        if (zona.equals("NACIONAL")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;     
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el peso del paquete: ");
        double peso = Double.parseDouble(input.nextLine());
        
        String zona;
        //dowhile para validar que la zona ingresada sea correcta
        do {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = input.nextLine().toUpperCase();

            if (!zona.equals("NACIONAL") && !zona.equals("INTERNACIONAL")) {
                System.out.println("Error: zona inválida. Intente de nuevo.");
            }
        } while (!zona.equals("NACIONAL") && !zona.equals("INTERNACIONAL"));
                    
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        System.out.println("El costo del envío es: " + costoEnvio);
        System.out.println("El precio total de la compra es: " + calcularTotalCompra(precioProducto, costoEnvio));
    }

}
