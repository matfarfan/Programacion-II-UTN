/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author mfarf
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        if (id == null) {
            this.id = "SIN-ID";
        } else {
            this.id = id;
        }

        if (nombre == null) {
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre;
        }

        if (nacionalidad == null) {
            this.nacionalidad = "N/D";
        } else {
            this.nacionalidad = nacionalidad;
        }
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (ID: " + id + ", Nacionalidad: " + nacionalidad + ")");
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
