/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Motor m = new Motor("Nafta 1.6", "MSN-00123");
        Vehiculo v = new Vehiculo("AB123CD", "Fiat Argo", m);
        Conductor c = new Conductor("Jesica López", "B2-AR-2025");

        v.setConductor(c); // establece la relación 1:1 bidireccional
        v.mostrar();
    }
}
