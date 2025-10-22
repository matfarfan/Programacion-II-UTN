/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan", 120000));
        empleados.add(new EmpleadoTemporal("Ana", 100, 800));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " cobra: $" + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) System.out.println("Tipo: Planta");
            else System.out.println("Tipo: Temporal");
        }
    }
}
