/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author mfarf
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;         // asociación unidireccional
    private Profesional profesional;   // asociación unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;           // inyectados
        this.profesional = profesional;
    }

    public String getFecha() { 
        return fecha; 
    }
    
    public String getHora() { 
        return hora; 
    }
    
    public Paciente getPaciente() { 
        return paciente; 
    }
    
    public Profesional getProfesional() {
        return profesional; 
    }

    public void mostrar() {
        System.out.println("Cita: " + fecha + " " + hora);
        System.out.println("Paciente: " + paciente.getNombre() +
                           " | Obra social: " + paciente.getObraSocial());
        System.out.println("Profesional: " + profesional.getNombre() +
                           " | Especialidad: " + profesional.getEspecialidad());
    }
}
