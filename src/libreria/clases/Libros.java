/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.clases;


public class Libros {
    private String titulo;
    private double precio;
    private String genero;
    private String autor;

    public Libros(String titulo, double precio, String genero, String autor ) {
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
        this.autor = autor;
    }

    public Libros(String quinta_Estacion, int i, Genero genero) {
      
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getGenero() {
        return genero;
    }
    public String getAutor () {
        return autor;
}
    
}
