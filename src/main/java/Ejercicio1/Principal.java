/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mfarf
 */
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        //Lista vacia donde van a guardarse los productos
        Inventario inventario = new Inventario();
        //Se carga la lista
        inventario.agregarProducto("001", "Televisor", 200000, 5, CategoriaProducto.ELECTRONICA);
        inventario.agregarProducto("002", "Remera de algodón", 12000, 10, CategoriaProducto.ROPA);
        inventario.agregarProducto("003", "Silla de comedor", 30000, 4, CategoriaProducto.HOGAR);
        inventario.agregarProducto("004", "Arroz integral", 1500, 20, CategoriaProducto.ALIMENTOS);
        inventario.agregarProducto("005", "Auriculares Bluetooth", 35000, 8, CategoriaProducto.ELECTRONICA);
        
        System.out.println("-----------------------------------");
        System.out.println(" ");
                
        //2. Listar todos los productos mostrando su información y categoría.
        System.out.println("\n--- Listado completo de productos ---");
        inventario.listarProductos();
        System.out.println("-----------------------------------");
        System.out.println(" ");
                
        //3. Buscar un producto por ID y mostrar su información.
        System.out.println("Eliga el producto a buscar por id: ");
        String id = input.nextLine();
        inventario.buscarProductoPorId(id);
        System.out.println("-----------------------------------");
        System.out.println(" ");
        
        //4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        inventario.mostrarCategoriasDisponibles();
        System.out.println("Que categoría desea visualizar: ");
        String categoria = input.nextLine().toUpperCase();      //convierte a mayúscula
        CategoriaProducto categoriaElegida = CategoriaProducto.valueOf(categoria);  //guarda la categoria elegida
        ArrayList<Producto> filtro = inventario.filtrarPorCategoria(categoriaElegida);  //crea lista y guarda la lista de la categoria
        inventario.listarProductos(filtro); //lista el filtro
        System.out.println("-----------------------------------");
        System.out.println(" ");
                
        //5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("Eliga el producto a eliminiar por id: ");
        id = input.nextLine(); //la variable ya esta definida anteriormente
        inventario.eliminarProducto(id);  //elimina      
        inventario.listarProductos(); //listado
        System.out.println("-----------------------------------");
        System.out.println(" ");
        
        //6. Actualizar el stock de un producto existente.
        System.out.println("Eliga el producto a actualizar el stock por id: ");
        inventario.listarProductos();
        id = input.nextLine(); //la variable ya esta definida anteriormente
        System.out.println(" ");
        System.out.println("Ingrese el nuevo stock: ");
        int nuevoStock = Integer.parseInt(input.nextLine());
        inventario.actualizarStock(id, nuevoStock);        
        System.out.println("-----------------------------------");
        System.out.println(" ");
                
        //7. Mostrar el total de stock disponible.
        System.out.println("El stock total es: "+inventario.obtenerTotalStock());
        System.out.println("-----------------------------------");
        System.out.println(" ");
        
        //8. Obtener y mostrar el producto con mayor stock.
        //Producto productoMayorStock = ;
        System.out.println("El producto con mayor stock es: "+inventario.obtenerProductoConMayorStock());
        System.out.println("-----------------------------------");
        System.out.println(" ");
                

        //9. Filtrar productos con precios entre $1000 y $3000.
        //ArrayList<Producto> productosMinMax = ;
        System.out.println("Productos con precios entre $1000 y $3000: "+inventario.filtrarProductosPorPrecio(1000, 3000));
        System.out.println("-----------------------------------");
        System.out.println(" ");
        
        //10. Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
    }

    
}
