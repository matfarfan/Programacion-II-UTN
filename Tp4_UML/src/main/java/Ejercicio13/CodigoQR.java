/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author mfarf
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // asociación unidireccional: CodigoQR → Usuario

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor()   {
        return valor; 
    }
    
    public Usuario getUsuario(){
        return usuario; 
    }

    public void mostrar() {
        System.out.println("QR: " + valor + " | Usuario: " +
                usuario.getNombre() + " <" + usuario.getEmail() + ">");
    }
}