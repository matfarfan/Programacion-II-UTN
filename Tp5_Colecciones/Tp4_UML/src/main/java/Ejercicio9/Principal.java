/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Paciente p = new Paciente("Jesica López", "OSDE");
        Profesional prof = new Profesional("Dra. Ruiz", "Pediatría");

        CitaMedica cita = new CitaMedica("06-10-2025", "14:30", p, prof);
        cita.mostrar();
    }
}
