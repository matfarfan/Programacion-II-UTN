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
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        if (nombre == null) {
            this.nombre = "Biblioteca sin nombre";
        } else {
            this.nombre = nombre;
        }
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    // Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null) {
            System.out.println("No se puede agregar: ISBN nulo.");
            return;
        }

        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            System.out.println("Ya existe un libro con ISBN " + isbn + ". No se agregó.");
            return;
        }

        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }

    // Listar libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en \"" + nombre + "\":");
            for (int i = 0; i < libros.size(); i++) {
                libros.get(i).mostrarInfo();
            }
        }
    }

    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        if (isbn == null) {
            return null;
        }
        for (int i = 0; i < libros.size(); i++) {
            Libro actual = libros.get(i);
            if (actual.getIsbn().equalsIgnoreCase(isbn)) {
                return actual;
            }
        }
        return null;
    }

    // Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        if (isbn == null) {
            return false;
        }
        for (int i = 0; i < libros.size(); i++) {
            Libro actual = libros.get(i);
            if (actual.getIsbn().equalsIgnoreCase(isbn)) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    // Contar libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Filtrar libros por año
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> resultado = new ArrayList<Libro>();
        for (int i = 0; i < libros.size(); i++) {
            Libro actual = libros.get(i);
            if (actual.getAnioPublicacion() == anio) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    // Mostrar autores disponibles sin repetir
    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores porque no hay libros cargados.");
        } else {
            ArrayList<Autor> autores = new ArrayList<Autor>();
            for (int i = 0; i < libros.size(); i++) {
                Autor actual = libros.get(i).getAutor();
                boolean existe = false;
                for (int j = 0; j < autores.size(); j++) {
                    if (autores.get(j).getId().equals(actual.getId())) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    autores.add(actual);
                }
            }

            System.out.println("Autores disponibles en \"" + nombre + "\":");
            for (int i = 0; i < autores.size(); i++) {
                autores.get(i).mostrarInfo();
            }
        }
    }
}
