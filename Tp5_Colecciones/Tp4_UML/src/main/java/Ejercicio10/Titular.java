/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author mfarf
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta; // asociación bidireccional

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        // guarda para mantener la bidireccionalidad sin recursión
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre; 
    }
    
    public int getDni() {
        return dni; 
    }
    
    public CuentaBancaria getCuenta() {
        return cuenta; 
    }
}