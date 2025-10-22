/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author mfarf
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;  // composición: parte creada adentro
    private Titular titular;       // asociación bidireccional

    // composición real: recibimos datos de la clave y la creamos dentro
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        // sincroniza el otro lado
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public String getCbu() {
        return cbu; 
    }
    
    public double getSaldo() {
        return saldo; 
    }
    
    public ClaveSeguridad getClave() {
        return clave; 
    }
    
    public Titular getTitular() {
        return titular; 
    }

    public void mostrar() {
        System.out.println("Cuenta: CBU " + cbu + " | Saldo: " + saldo);
        System.out.println("Clave: " + clave.getCodigo() + " | Últ. mod.: " + clave.getUltimaModificacion());
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (DNI " + titular.getDni() + ")");
        }
    }
}
