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
public class ConversionesYDivisiones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //definimos las variables
        int num1, num2, divisionEntera;
        double divisionDecimal;
        
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        //division entera
        divisionEntera = num1 / num2;
        
        //division decimal
        divisionDecimal = (double) num1 / num2;
        
        //resultados
        System.out.println("Resultados:");
        System.out.println("División entera: " + divisionEntera);
        System.out.println("División decimal: " + divisionDecimal);
    }
}
