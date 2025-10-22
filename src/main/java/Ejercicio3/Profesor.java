/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author mfarf
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;

    //Lista de cursos que este profesor dicta (lado 1 → N)
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        if (id == null) {
            this.id = "SIN-ID";
        } else {
            this.id = id;
        }

        if (nombre == null) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }

        if (especialidad == null) {
            this.especialidad = "N/D";
        } else {
            this.especialidad = especialidad;
        }

        this.cursos = new ArrayList<Curso>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public ArrayList<Curso> getCursos() { return cursos; }

    /* =====================================================
       Relación bidireccional (Profesor ↔ Curso)
       -----------------------------------------------------
       - Cuando agregamos un curso a la lista del profesor,
         también debemos asegurarnos de que el curso
         tenga asignado a este profesor.
       - Esto mantiene la relación sincronizada en ambos lados.
       ===================================================== */
    public void agregarCurso(Curso c) {
        if (c == null) {
            System.out.println("No se puede agregar un curso null al profesor " + nombre);
            return;
        }

        //Evitar duplicados
        boolean yaEsta = false;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equalsIgnoreCase(c.getCodigo())) {
                yaEsta = true;
                break;
            }
        }

        if (!yaEsta) {
            cursos.add(c);
        }

        //Si el curso no apunta todavía a este profesor, lo sincronizamos
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    /* =====================================================
       Eliminar un curso
       -----------------------------------------------------
       - Si el profesor deja de dictar un curso, lo quitamos
         de su lista y además hacemos que el curso deje de
         apuntar a este profesor (profesor = null).
       ===================================================== */
    public void eliminarCurso(Curso c) {
        if (c == null) return;

        int indice = -1;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equalsIgnoreCase(c.getCodigo())) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            cursos.remove(indice);
        }

        //Si el curso todavía apunta a este profesor, lo “desvinculamos”
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    /* =====================================================
       Métodos internos para sincronización
       -----------------------------------------------------
       - Usados dentro de Curso.setProfesor() para mantener
         la coherencia sin provocar llamadas recursivas.
       ===================================================== */
    void _agregarCursoSincronizado(Curso c) {
        boolean yaEsta = false;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equalsIgnoreCase(c.getCodigo())) {
                yaEsta = true;
                break;
            }
        }
        if (!yaEsta) {
            cursos.add(c);
        }
    }

    void _eliminarCursoSincronizado(Curso c) {
        int indice = -1;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equalsIgnoreCase(c.getCodigo())) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            cursos.remove(indice);
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no dicta cursos.");
            return;
        }
        System.out.println("Cursos de " + nombre + ":");
        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            System.out.println(" - " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + id + ", Esp: " + especialidad + "), cursos=" + cursos.size());
    }
}
