/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author mfarf
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void mostrar() {
        System.out.println("Reserva: " + fecha + " " + hora);
        System.out.println("Mesa: #" + mesa.getNumero() + " (capacidad " + mesa.getCapacidad() + ")");
        System.out.println("Cliente: " + cliente.getNombre() + " - Tel: " + cliente.getTelefono());
    }
}
