/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN - Programación II");

        //1.Crear profesores y cursos
        Profesor p1 = new Profesor("P-001", "Ana Gómez", "Bases de Datos");
        Profesor p2 = new Profesor("P-002", "Luis Pérez", "Programación");
        Profesor p3 = new Profesor("P-003", "María López", "Redes");

        Curso c1 = new Curso("BD101", "Introducción a BD");
        Curso c2 = new Curso("PR201", "Programación I");
        Curso c3 = new Curso("PR202", "Programación II");
        Curso c4 = new Curso("NW301", "Fundamentos de Redes");
        Curso c5 = new Curso("NW302", "Redes Avanzadas");

        //2.Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        //3.Asignar profesores a cursos (mantiene bidireccionalidad)
        uni.asignarProfesorACurso("BD101", "P-001");
        uni.asignarProfesorACurso("PR201", "P-002");
        uni.asignarProfesorACurso("PR202", "P-002");
        uni.asignarProfesorACurso("NW301", "P-003");

        //4.Listar todo
        System.out.println("\n--- Cursos ---");
        uni.listarCursos();

        System.out.println("\n--- Profesores ---");
        uni.listarProfesores();

        //5.Cambiar profesor de un curso y verificar sincronización
        System.out.println("\n>>> Cambio de profesor: PR202 pasa a P-003");
        uni.asignarProfesorACurso("PR202", "P-003");

        //6.Remover un curso
        System.out.println("\n>>> Eliminando curso PR201");
        uni.eliminarCurso("PR201");

        //7.Remover un profesor
        System.out.println("\n>>> Eliminando profesor P-003");
        uni.eliminarProfesor("P-003");

        //8.Mostrar resultados finales y reporte
        System.out.println("\n--- Cursos finales ---");
        uni.listarCursos();

        System.out.println("\n--- Profesores finales ---");
        uni.listarProfesores();

        System.out.println("\n--- Reporte de cursos por profesor ---");
        uni.reporteCantidadCursosPorProfesor();
    }
}
