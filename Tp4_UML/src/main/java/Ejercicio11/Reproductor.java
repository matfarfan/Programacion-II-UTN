/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author mfarf
 */
public class Reproductor {
    // Dependencia de uso: recibe la Cancion por parámetro y NO la guarda como atributo
    public void reproducir(Cancion cancion) {
        Artista a = cancion.getArtista();
        System.out.println("Reproduciendo: '" + cancion.getTitulo() +
                "' - " + a.getNombre() + " (" + a.getGenero() + ")");
    }
}
