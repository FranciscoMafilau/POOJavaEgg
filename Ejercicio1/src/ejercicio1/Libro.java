package ejercicio1;


import ejercicio1.Libreria.Entidades;
import java.util.Scanner;
public class Libro {

    /*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
    y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
    cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
    el autor del libro y el número de páginas.
     */
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
       
        String autor = leer.nextLine();
        String titulo = leer.nextLine();
        Entidades libro1 = new Entidades(leer.next(), titulo, autor, leer.nextInt());
        
        //libro1.cargarLibros();
        
        
        libro1.mostrarLibro();
        
         System.out.println("Ingrese los datos en el siguiente orden: autor, titulo, isbn, num paginas");
        Entidades libro2 = new Entidades(leer.next(), titulo, autor, leer.nextInt());
        
       
        
        //libro2.mostrarLibro();
        
    }
}
    


