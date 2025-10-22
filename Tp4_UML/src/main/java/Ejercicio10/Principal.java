/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        // Composición: la cuenta crea su ClaveSeguridad internamente
        CuentaBancaria cb = new CuentaBancaria(
                "2850590940090418135201",
                150000.0,
                "H4SH-ABC-123",
                "10-06/2024"
        );

        // Asociación bidireccional 1:1
        Titular t = new Titular("Jesica López", 12345678);
        cb.setTitular(t);

        cb.mostrar();
    }
}
