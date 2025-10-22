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
public class Ejercicio13 {
    public static void imprimirArray(double[] precios, int index){
        if (index == precios.length){ //caso base
            return;
        } else {
            System.out.println("Precio: $" + precios[index]);
            imprimirArray(precios, index + 1); // llamada recursiva
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirArray(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados");
        imprimirArray(precios, 0);
    }
}
