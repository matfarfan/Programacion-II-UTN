/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Bateria bat = new Bateria("BLP813", 5000);
        Celular cel = new Celular ("356789012345678", "Xiaomi", "Redmi 12", bat);
        Usuario usu = new Usuario("Ana López", 12345678);

        cel.setUsuario(usu);   // establece la asociación 1:1 bidireccional
        cel.mostrar();         // salida de verificación
    }
}
