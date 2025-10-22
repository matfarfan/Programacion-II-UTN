/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Video UTN", 4);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", p); // dependencia de creación: crea y usa Render sin guardarlo
    }
}
