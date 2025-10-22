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
public class Ejercicio12 {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        for (double i : precios) {
            System.out.println("Precio: $"+i);
        }
        precios[2] = 129.99;
        System.out.println("Precios modificados: ");
        for (double i : precios) {
            System.out.println("Precio: $"+i);
        }
    }
}
