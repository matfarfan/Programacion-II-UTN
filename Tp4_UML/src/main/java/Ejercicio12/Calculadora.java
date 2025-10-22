/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author mfarf
 */
public class Calculadora {
    // Dependencia de uso: recibe el Impuesto por parámetro y NO lo guarda como atributo
    public void calcular(Impuesto impuesto) {
        Contribuyente c = impuesto.getContribuyente();
        System.out.println("Calculando impuesto de $" + impuesto.getMonto()
                + " para " + c.getNombre() + " (CUIL " + c.getCuil() + ")");
        // acá iría la lógica de cálculo si la pidieran; por ahora solo mostramos
    }
}