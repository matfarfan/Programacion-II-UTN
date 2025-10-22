/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author mfarf
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // agregación (inyectado)

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // llega de afuera → agregación
    }

    public String getCodigoHash() { 
        return codigoHash; 
    }
    
    public String getFecha()      {
        return fecha; 
    }
    
    public Usuario getUsuario()   {
        return usuario; 
    }
}
