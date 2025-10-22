/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Usuario u = new Usuario("Jesica López", "jesi@example.com");
        Documento doc = new Documento(
                "Contrato de Servicios",
                "Texto del contrato...",
                "ABC123DEF456",     // codigoHash
                "2025-09-28",       // fecha
                u                   // Usuario inyectado a la firma
        );

        doc.mostrar();
    }
}
