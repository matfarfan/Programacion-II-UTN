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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        if (nombre == null) {
            this.nombre = "Universidad sin nombre";
        } else {
            this.nombre = nombre;
        }
        this.profesores = new ArrayList<Profesor>();
        this.cursos = new ArrayList<Curso>();
    }

    public String getNombre() { return nombre; }

    //Agregar profesor a la universidad
    public void agregarProfesor(Profesor p) {
        if (p == null) return;

        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("Ya existe un profesor con id " + p.getId());
            return;
        }

        profesores.add(p);
    }

    //Agregar curso a la universidad
    public void agregarCurso(Curso c) {
        if (c == null) return;

        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println("Ya existe un curso con código " + c.getCodigo());
            return;
        }

        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        if (id == null) return null;
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getId().equalsIgnoreCase(id)) {
                return profesores.get(i);
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo == null) return null;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                return cursos.get(i);
            }
        }
        return null;
    }

    /* =====================================================
       Asignar profesor a curso
       -----------------------------------------------------
       - Usa el método setProfesor() del curso, que se encarga
         de sincronizar ambos lados de la relación.
       ===================================================== */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);

        if (c == null || p == null) {
            System.out.println("Curso o profesor no encontrado.");
            return;
        }

        c.setProfesor(p);
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados.");
            return;
        }

        System.out.println("Profesores en \"" + nombre + "\":");
        for (int i = 0; i < profesores.size(); i++) {
            Profesor p = profesores.get(i);
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos cargados.");
            return;
        }

        System.out.println("Cursos en \"" + nombre + "\":");
        for (int i = 0; i < cursos.size(); i++) {
            cursos.get(i).mostrarInfo();
        }
    }

    /* =====================================================
       Eliminar curso
       -----------------------------------------------------
       - Si el curso tenía profesor, primero se rompe la
         relación bidireccional (setProfesor(null)).
       ===================================================== */
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) {
            System.out.println("Curso no encontrado.");
            return;
        }

        if (c.getProfesor() != null) {
            c.setProfesor(null); // rompe el vínculo bidireccional
        }

        cursos.remove(c);
        System.out.println("Curso " + codigo + " eliminado.");
    }

    /* =====================================================
       Eliminar profesor
       -----------------------------------------------------
       - Antes de eliminar al profesor, debemos recorrer
         todos los cursos y dejar su profesor en null para
         mantener la coherencia de la relación.
       ===================================================== */
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) {
            System.out.println("Profesor no encontrado.");
            return;
        }

        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            if (c.getProfesor() == p) {
                c.setProfesor(null);
            }
        }

        profesores.remove(p);
        System.out.println("Profesor " + id + " eliminado.");
    }

    //Reporte de cantidad de cursos por profesor
    public void reporteCantidadCursosPorProfesor() {
        System.out.println("Reporte: cantidad de cursos por profesor");
        for (int i = 0; i < profesores.size(); i++) {
            Profesor p = profesores.get(i);
            int contador = 0;
            for (int j = 0; j < p.getCursos().size(); j++) {
                contador = contador + 1;
            }
            System.out.println("- " + p.getNombre() + ": " + contador + " curso(s)");
        }
    }
}
