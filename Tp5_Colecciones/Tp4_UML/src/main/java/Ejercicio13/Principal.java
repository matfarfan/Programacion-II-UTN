/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Usuario u = new Usuario("Jesica López", "jesi@example.com");
        GeneradorQR gen = new GeneradorQR();

        gen.generar("PAGO#12345", u); // crea el QR y lo usa sin guardarlo
    }
}
