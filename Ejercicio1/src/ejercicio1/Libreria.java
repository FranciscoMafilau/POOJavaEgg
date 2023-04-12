package ejercicio1;

import entidades.Libro;
import java.util.Scanner;

public class Libreria {

    /*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
    y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
    cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
    el autor del libro y el número de páginas.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

       Libro b1 = new Libro();
       b1.setAutor("rick");
        System.out.println("El autor del libro es :" + b1.getAutor() );
        b1.setTitulo("Percy Jackson");
        System.out.println("El titulo del libro es :" + b1.getTitulo());
        
       
    
        
        
       
       
        //Entidades libro1 = new Entidades(leer.next(), titulo, autor, leer.nextInt());
        
       
        
        //libro1.setAutor("rick");
        //libro1.setTitulo("percy");
        //System.out.println("libro: " +libro1.getAutor()+libro1.getTitulo());
        // libro1.mostrarLibro();


       // Entidades libro2 = new Entidades(leer.next(), titulo, autor, leer.nextInt());

        //libro2.mostrarLibro();
                }
                }

