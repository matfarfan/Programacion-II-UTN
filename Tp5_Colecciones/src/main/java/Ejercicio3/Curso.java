/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author mfarf
 */
public class Curso {
    private String codigo;
    private String nombre;

    //Lado inverso: referencia a su profesor (lado N → 1)
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        if (codigo == null) {
            this.codigo = "SIN-COD";
        } else {
            this.codigo = codigo;
        }

        if (nombre == null) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }

        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    /* =====================================================
       Relación bidireccional desde el lado del Curso
       -----------------------------------------------------
       - Este método asigna o cambia el profesor del curso.
       - Debe mantener la sincronización con el otro lado:
         si cambia el profesor, también se actualiza la lista
         del profesor anterior y del nuevo.
       ===================================================== */
    public void setProfesor(Profesor p) {
        // Si no hay cambio, no hacer nada
        if (this.profesor == p) {
            return;
        }

        Profesor anterior = this.profesor; // guardar el profesor previo
        this.profesor = p; // asignar el nuevo

        //Si tenía profesor anterior, quitar este curso de su lista
        if (anterior != null) {
            anterior._eliminarCursoSincronizado(this);
        }

        //Si tiene nuevo profesor, agregar este curso a su lista
        if (p != null) {
            p._agregarCursoSincronizado(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor;
        if (profesor == null) {
            nombreProfesor = "(sin profesor)";
        } else {
            nombreProfesor = profesor.getNombre();
        }
        System.out.println("Curso: " + codigo + " | " + nombre + " | Profesor: " + nombreProfesor);
    }
}
