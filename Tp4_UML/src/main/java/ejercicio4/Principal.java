/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
    
        Banco banco = new Banco("Banco Nación","30-12345678-9");
        Cliente cliente = new Cliente("Matias Farfan", 12345678);
        TarjetaDeCredito tdc = new TarjetaDeCredito("4509 1234 5678 9012", "12/27", banco);
    
        tdc.setCliente(cliente);
        tdc.mostrar();
    
    }
}
