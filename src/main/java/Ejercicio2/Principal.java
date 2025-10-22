/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        //1) Crear biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca UTN");

        //2) Crear tres autores
        Autor a1 = new Autor("A-001", "Julio Cortázar", "Argentina");
        Autor a2 = new Autor("A-002", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A-003", "Haruki Murakami", "Japón");

        //3) Agregar 5 libros
        biblio.agregarLibro("978-987-1234567", "Rayuela", 1963, a1);
        biblio.agregarLibro("978-950-7423456", "Bestiario", 1951, a1);
        biblio.agregarLibro("978-84-2041234", "La casa de los espíritus", 1982, a2);
        biblio.agregarLibro("978-987-6543210", "Tokio Blues (Norwegian Wood)", 1987, a3);
        biblio.agregarLibro("978-950-1237890", "Kafka en la orilla", 2002, a3);

        //4) Listar todos los libros
        System.out.println("\n(4) Listado de libros:");
        biblio.listarLibros();

        //5) Buscar por ISBN
        System.out.println("\n(5) Búsqueda por ISBN:");
        Libro encontrado = biblio.buscarLibroPorIsbn("978-987-6543210");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró el libro.");
        }

        //6) Filtrar por año
        System.out.println("\n(6) Filtrar por año (1987):");
        ArrayList<Libro> del1987 = biblio.filtrarLibrosPorAnio(1987);
        if (del1987.isEmpty()) {
            System.out.println("No hay libros del año 1987.");
        } else {
            for (int i = 0; i < del1987.size(); i++) {
                del1987.get(i).mostrarInfo();
            }
        }

        //7) Eliminar un libro y listar los restantes
        System.out.println("\n(7) Eliminar libro ISBN 978-950-7423456:");
        boolean eliminado = biblio.eliminarLibro("978-950-7423456");
        if (eliminado) {
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("No se encontró el libro a eliminar.");
        }
        biblio.listarLibros();

        //8) Cantidad total de libros
        System.out.println("\n(8) Cantidad total de libros: " + biblio.obtenerCantidadLibros());

        //9) Mostrar autores disponibles
        System.out.println("\n(9) Autores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }
}
