/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }
    }
}
