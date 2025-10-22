/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author mfarf
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // composición (se crea adentro)

    // Composición: creo la "parte" (FirmaDigital) dentro del Documento
    public Documento(String titulo, String contenido,
                     String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario); // ← composición + agregación
    }

    public String getTitulo()     { 
        return titulo; 
    }
    
    public String getContenido()  { 
        return contenido; 
    }
    
    public FirmaDigital getFirma(){ 
        return firma; 
    }

    public void mostrar() {
        System.out.println("Documento: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Firma: hash=" + firma.getCodigoHash() + " | fecha=" + firma.getFecha());
        Usuario u = firma.getUsuario();
        System.out.println("Usuario firmante: " + u.getNombre() + " <" + u.getEmail() + ">");
    }
}
