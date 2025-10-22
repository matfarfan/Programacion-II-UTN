/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("A123456789", "2025-01-01", "foto.jpg", "JPG");
        Titular titular = new Titular("Ana López", "12345678");

        // establecemos la relación bidireccional
        pasaporte.setTitular(titular);

        // Mostrar datos
        System.out.println("Pasaporte: " + pasaporte.getNumero() +
                           " emitido el " + pasaporte.getFechaEmision());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen() +
                           " (" + pasaporte.getFoto().getFormato() + ")");
        System.out.println("Titular: " + pasaporte.getTitular().getNombre() +
                           " DNI: " + pasaporte.getTitular().getDni());
    }
}

