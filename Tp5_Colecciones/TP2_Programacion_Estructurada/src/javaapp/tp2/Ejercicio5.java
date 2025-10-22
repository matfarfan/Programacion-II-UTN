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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 1;
        int suma = 0;
        while (num != 0) {
            System.out.println("Ingrese un número (0 para salir): ");
            num = Integer.parseInt(input.nextLine());
            if (num%2 == 0) {
                suma += num;
            }
                
            }
        System.out.println("La suma de los número pares ingresados es: " + suma);
        }
    }

