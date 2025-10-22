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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el tercer número: ");
        int num3 = Integer.parseInt(input.nextLine());
        
        int mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;      
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);
}
}
