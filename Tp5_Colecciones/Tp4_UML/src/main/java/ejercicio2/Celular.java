/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mfarf
 */
public class Celular {
    private String imei; //Muy largo para ser int
    private String marca;
    private String modelo;
    private Bateria bateria; // agregación (inyectada)
    private Usuario usuario; // asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // agregación
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this); // mantiene la bidireccionalidad
        }
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void mostrar() {
        System.out.println("Celular IMEI " + imei + " - " + marca + " " + modelo);
        System.out.println("Batería: " + bateria.getModelo() + " (" + bateria.getCapacidad() + " mAh)");
        if (usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre() + " (DNI " + usuario.getDni() + ")");
        }
    }
}
