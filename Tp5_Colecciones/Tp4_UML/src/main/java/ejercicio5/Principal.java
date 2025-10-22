/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("ASUS", "SN-001-XYZ", "B550M-A", "AMD B550");
        Propietario propietario = new Propietario("Matias Farfan", 12345678);
        
        computadora.setPropietario(propietario);
        computadora.mostrar();
    }
}

