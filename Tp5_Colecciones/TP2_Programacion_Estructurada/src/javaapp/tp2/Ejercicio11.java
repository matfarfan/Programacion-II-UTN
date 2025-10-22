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
public class Ejercicio11 {
    //variable global
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        return descuentoAplicado;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("El descuento especial aplicado es: "+DESCUENTO_ESPECIAL*100 + "%");
        System.out.println("");
        System.out.print("El precio final con descuento es: " + (precio - calcularDescuentoEspecial(precio)));
        
        
    }
}
