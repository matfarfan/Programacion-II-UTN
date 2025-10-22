/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock");
        Cancion tema = new Cancion("De música ligera", artista);

        Reproductor rep = new Reproductor();
        rep.reproducir(tema); // dependencia de uso: parámetro, sin guardar estado
    }
}
