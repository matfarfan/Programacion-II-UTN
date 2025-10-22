/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author mfarf
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null) {
            this.isbn = "SIN-ISBN";
        } else {
            this.isbn = isbn;
        }

        if (titulo == null) {
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo;
        }

        this.anioPublicacion = anioPublicacion;

        if (autor == null) {
            this.autor = new Autor("SIN-AUTOR", "Autor desconocido", "N/D");
        } else {
            this.autor = autor;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("- " + titulo + " | ISBN: " + isbn +
                " | Año: " + anioPublicacion +
                " | Autor: " + autor);
    }

    @Override
    public String toString() {
        return titulo + " (ISBN " + isbn + ", " + anioPublicacion + ") - " + autor;
    }
}
