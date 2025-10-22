/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author mfarf
 */
public class GeneradorQR {
    // Dependencia de CREACIÓN: crea el CódigoQR con 'new' y NO lo guarda como atributo
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // <<create>>
        // Se usa localmente (ej. mostrar, enviar, imprimir), pero no se conserva
        qr.mostrar();
    }
}