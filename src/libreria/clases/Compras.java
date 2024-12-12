/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.clases;


public class Compras {
     private static final double IVA = 0.12; 

        
    

    public void mostrarDetalleLibros(Libros libros) {
        double precioConIva = libros.getPrecio() + (libros.getPrecio() * IVA);
        System.out.println("Libros: " + libros.getTitulo());
        System.out.println("Genero: " + libros.getGenero());
        System.out.println("Precio (sin IVA): $" + libros.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);
    }

    public void mostrarClientesYLibros(Clientes clientes, Libros libros) {
        double precioConIva = libros.getPrecio() + (libros.getPrecio() * IVA);
        System.out.println("Clientes: " + clientes.getNombre());
        System.out.println("Libros comprado: " + libros.getAutor());
        System.out.println("Genero: " + libros.getGenero());
        System.out.println("Precio (sin IVA): $" + libros.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);
    }
}
    

