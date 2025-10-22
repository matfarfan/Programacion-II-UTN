/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_poo;

import java.util.Scanner;

/**
 *
 * @author mfarf
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Estudiante
        System.out.println("1- Estudiante");
        //Instanciar estudiante
        Estudiante e = new Estudiante();
        e.nombre = "Matias";
        e.apellido = "Farfan";
        e.curso = "Programacion II";
        e.calificacion = 7;
        //mostrar su info
        e.mostrarInfo();
        //aumentar y disminuir calificaciones
        System.out.println(" ");
        e.subirCalificacion(8);
        System.out.println("Calificación: "+e.calificacion);
        System.out.println(" ");
        e.bajarCalificacion(10);
        System.out.println("Calificación: "+e.calificacion);
        
        //Moscota
        System.out.println(" ");
        System.out.println("2- Mascota");
        //Crear mascota
        Mascota m = new Mascota();
        m.nombre = "Ciro";
        m.especie = "Boxer";
        m.edad = 8;
        //Mostrar info
        m.mostrarInfo();
        //Paso del tiempo
        m.cumplirAnios();
        m.cumplirAnios();
        System.out.println(" ");
        System.out.println("Dos años después");
        System.out.println("Nueva edad: " + m.edad);
        
        //Libro
        System.out.println(" ");
        System.out.println("3- Libro (encapsulamiento)");
        //Crear libro
        Libro l = new Libro("Cien años de soledad", "Gabriel García Marquez", 1967);
        //Mostramos
        System.out.println("Título: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Año: " + l.getAnioPublicacion());
        //Intentamos modificar
        System.out.println(" ");
        l.setAnioPublicacion(2030);
        System.out.println(" ");
        l.setAnioPublicacion(1980);
        //VOlvemos a mostrar
        System.out.println(" ");
        System.out.println("Título: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Año: " + l.getAnioPublicacion());
        
        //Gallina
        System.out.println(" ");
        System.out.println("4- Gallina");
        //Crear dos gallinas
        Gallina g1 = new Gallina();
        g1.idGallina = 0001;
        g1.edad = 3;
        g1.huevosPuestos = 15;
        g1.mostrarEstado();
        System.out.println(" ");
        
        Gallina g2 = new Gallina();
        g2.idGallina = 0002;
        g2.edad = 5;
        g2.huevosPuestos = 28;
        g2.mostrarEstado();
        
        //Simulacion y nuevos datos
        System.out.println(" ");
        System.out.println("Nuevos estados: ");
        g1.ponerHuevos(); g1.ponerHuevos(); g1.ponerHuevos();
        g1.envejecer();
        g1.mostrarEstado();
        System.out.println(" ");
        
        g2.ponerHuevos();
        g2.envejecer(); g2.envejecer(); g2.envejecer();
        g2.mostrarEstado();
        
        //Nave espacial
        System.out.println(" ");
        System.out.println("5- Nave Espacial");
        NaveEspacial n = new NaveEspacial();
        n.nombre = "Halcón Galáctico";
        n.combustible = 50;
        n.mostrarEstado();
        //despegue
        n.despegar();
        //avanzar
        n.avanzar(15);
        n.avanzar(12);
        n.avanzar(100);
        //Recarga combustible
        System.out.println(" ");
        n.recargarCombustible(100);
        n.recargarCombustible(20);
        //Mostrar estado
        System.out.println(" ");
        n.mostrarEstado();
   
    }
}
