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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positivos=0, negativos=0, ceros=0; 
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            int num = Integer.parseInt(input.nextLine());
            
            if (num == 0) {
                ceros += 1;
            }else if (num > 0) {
                positivos +=1;
            }else {
                negativos +=1;
            }
        }
        System.out.println("La cantidad de números ceros es: " + ceros);
        System.out.println("La cantidad de números positivos es: " + positivos);
        System.out.println("La cantidad de números negativos es: " + negativos);
    }
}
