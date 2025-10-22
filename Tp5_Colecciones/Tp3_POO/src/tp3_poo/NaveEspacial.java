/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author mfarf
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    
    public void despegar() {
      if (combustible>0) {
            System.out.println("Despegue exitoso!!!");
        }else{
            System.out.println("Combustible insuficiente para despegar");
        }  
    }
    
    public void avanzar(int distancia) {
        if (combustible>=distancia) {
            combustible -= distancia;
            System.out.println("Avanzamos "+distancia+" de distancia.");
        }else{
            System.out.println("Combustible insuficiente para esa distancia: "+distancia);
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (cantidad>0 && (combustible+cantidad)<=50) {
            combustible += cantidad;
            System.out.println("Regarca de "+cantidad+" exitosa!");
        } else{
            System.out.println("Cantidad de combustible inválido para recargar: "+cantidad);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: "+nombre+"\nCombustible: "+combustible);
    }
}
