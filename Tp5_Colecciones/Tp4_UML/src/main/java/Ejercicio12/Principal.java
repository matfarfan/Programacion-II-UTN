/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Contribuyente cont = new Contribuyente("Jesica López", "27-12345678-9");
        Impuesto imp = new Impuesto(125000.0, cont);

        Calculadora calc = new Calculadora();
        calc.calcular(imp); // dependencia de uso: parámetro local
    }
}
