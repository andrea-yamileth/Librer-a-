/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import libreria.clases.Clientes;
import libreria.clases.Compras;
import libreria.clases.Genero;
import libreria.clases.Libros;


public class Libreria {

   
    public static void main(String[] args) {
        Clientes clientes = new Clientes("Manuel Garcia");
        Clientes clientes2= new Clientes("Joaquin Orozco");


        Libros QuintaEstacion = new Libros("QuintaEstacion", 15 , Genero.FICCION);
        Libros Alicia  = new Libros("Alicia", (int) 7.75, Genero.NOFICCION);

       
        Compras compras = new Compras();

       
        compras.mostrarDetalleLibros(QuintaEstacion);
        compras.mostrarDetalleLibros(Alicia);

        
        compras.mostrarClientesYLibros(clientes, QuintaEstacion);
        compras.mostrarClientesYLibros(clientes2,Alicia );
    }
}
    
    

