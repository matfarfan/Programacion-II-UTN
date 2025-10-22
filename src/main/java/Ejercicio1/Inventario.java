/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author mfarf
 */
public class Inventario {
    private ArrayList<Producto> productos;
    
    //Constructor sin parámetros (inicializa la lista)
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public Inventario(ArrayList prodcutos) {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        //recibir un producto y guardarlo dentro de una lista productos
        //verificar que no sea nulo
        if (p == null) {
            System.out.println("No se puede agregar un producto nulo.");
            return;
        } 
        //Buscar duplicado por ID
        for (Producto productoExistente : productos) {
            if (productoExistente.getId().equalsIgnoreCase(p.getId())) {
                System.out.println("Producto ya existente");
                return;
            }
        }
        //agregar a la lista
        productos.add(p);
        System.out.println("Producto agregado con éxito: " + p.getNombre());
    }

    //Metodo sobrecargado: recibe los datos del producto directamente
    public void agregarProducto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        // Crea un nuevo objeto Producto con los datos recibidos
        Producto nuevo = new Producto(id, nombre, precio, cantidad, categoria);
        // Llama al otro método (reutiliza la lógica de validación y agregado)
        agregarProducto(nuevo);
    }
    
    public void listarProductos() {
        //asegurarse de que la liste no este vacia
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        //ver todos los productos listados, recorrer lista y mostrar info
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            System.out.println("-----------------------------------");
            producto.mostrarInfo();
        }
    }
    
    public void listarProductos(ArrayList<Producto> productos) {
        //asegurarse de que la liste no este vacia
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        //ver todos los productos listados, recorrer lista y mostrar info
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            System.out.println("-----------------------------------");
            producto.mostrarInfo();
        }
    }    

    public Producto buscarProductoPorId(String id) {
        //valida por parámetro
        if (id == null || id.trim().isEmpty()){
            System.out.println("El id no puede estar vacio o ser null");
            return null;
        }
        //recorrer la lista y buscar por id
        for (Producto producto : productos) {
            if (producto.getId().equalsIgnoreCase(id)) {
                System.out.println("Producto encontrado:");
                producto.mostrarInfo();
                return producto;
            }
        }
        //devuelve null si no lo encuentra
        System.out.println("No se encontró ningún producto con el Id: "+id);
        return null;
    }
    
    public boolean eliminarProducto(String id) {
        Producto productoEncontrado = buscarProductoPorId(id);
        if (productoEncontrado == null) {
            System.out.println("No se encontró ningún producto con el ID: " + id);
            return false;
        }
        productos.remove(productoEncontrado);
        System.out.println("Se eliminó correctamente el producto: "+productoEncontrado.getNombre());
        return true;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        if (nuevaCantidad < 0) {
            System.out.println("El producto no puede tener cantidad negativa");
            return false;
        }
        //buscamos el producto por id
        Producto productoEncontrado = buscarProductoPorId(id);
        if (productoEncontrado == null) {
            System.out.println("No se encontró ningún producto con el ID: " + id);
            return false;
        }
        //se actualiza el stock
        productoEncontrado.setCantidad(nuevaCantidad);
        System.out.println("Stock actualizado correctamente");
        //Mostrar cómo quedó el producto final
        System.out.println("");
        System.out.println("Producto actualizado:");
        System.out.println("------------------------------");
        productoEncontrado.mostrarInfo(); //muestra todos los datos actualizado
        System.out.println("------------------------------");
        return true;        
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        //Creamos lista vacia
        ArrayList<Producto> resultado = new ArrayList<>();
        //traemos las categorias y aplicamos el filtro
        if (categoria == null) {
            System.out.println("La categoria no puede ser null");
            return resultado;
        }
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                resultado.add(producto);
            }
        }
        System.out.println("Estos son los productos para la categoría "+categoria+": ");
        return resultado;
    
    }

    public int obtenerTotalStock() {
        int stockTotal = 0;
        //recorrer la lista e ir sumando el atributo stock
        for (Producto producto : productos) {
            stockTotal += producto.getCantidad();
        }
        return stockTotal;
    }

    public Producto obtenerProductoConMayorStock() {
        //validacion
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados en el inventario.");
            return null;
        }
        Producto productoMayorStock = productos.get(0);

        for (Producto producto : productos) {
            if (producto.getCantidad() > productoMayorStock.getCantidad()) {
            productoMayorStock = producto;
            }
        }

        return productoMayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        //Creamos lista vacia
        ArrayList<Producto> resultado = new ArrayList<>();
        //valida lista vacia
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados en el inventario.");
            return resultado;
        }
        //recorremos y aplicamos el filtro para el minimo y maximo
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio()<=max) {
                //agregamos a la nueva lista
                resultado.add(producto);
            }
        }
        return resultado;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorias disponibles: ");
        System.out.println("------------------------------");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("Categoría: "+categoria.name());
            System.out.println("Descripción: "+categoria.getDescripcion());
        }
    }
    
}
