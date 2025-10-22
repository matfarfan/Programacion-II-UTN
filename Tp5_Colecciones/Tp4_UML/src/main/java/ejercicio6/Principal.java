/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matias Farfan", "1525142536");
        Mesa mesa = new Mesa(5,4);
        
        Reserva reserva = new Reserva("28/7", "15:00", mesa, cliente);
        reserva.mostrar();
    }
}
