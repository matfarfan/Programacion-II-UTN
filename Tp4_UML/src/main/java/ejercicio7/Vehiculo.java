/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mfarf
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;          // agregación (inyectada)
    private Conductor conductor;  // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // inyección -> agregación (no hacemos new Motor aquí)
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this); // sincroniza el otro lado
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    public void mostrar() {
        System.out.println("Vehículo: " + patente + " | Modelo: " + modelo);
        System.out.println("Motor: " + motor.getTipo() + " (N° " + motor.getNumeroSerie() + ")");
        if (conductor != null) {
            System.out.println("Conductor: " + conductor.getNombre() +
                               " | Licencia: " + conductor.getLicencia());
        }
    }
}
