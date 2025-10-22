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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la categoría del producto (A, B o C)");
        String categoria = input.nextLine().toUpperCase(); //Lo convierte a mayúscula para evitar errores
        
        //calculo del descuento
        double descuento = 0;
        switch (categoria) {
            case "A" -> descuento = 0.10;
            case "B" -> descuento = 0.15;
            case "C" -> descuento = 0.20;
            default -> {
                System.out.println("Categoría no válida.");
                return; // termina el programa
            }
        }
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        
    }
}
