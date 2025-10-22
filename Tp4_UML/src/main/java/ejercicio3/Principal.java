/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Julio Cortázar", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Av. Siempreviva 742, CABA");
        Libro libro = new Libro("Rayuela", "978-950-07-1234-5", autor, editorial);

        libro.mostrar();
    }
}
