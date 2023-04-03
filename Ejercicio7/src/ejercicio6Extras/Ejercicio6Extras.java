
package ejercicio6Extras;

import entidades.Rectangulo;
  /*
    Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y 
    un método "calcular_area" que calcule y devuelva el área del rectángulo.
    Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de
    4 y 6 y imprime el área del rectángulo.
    */

public class Ejercicio6Extras {

    public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo();
       r1.setLado1(6);
       r1.setLado2(4);
       
        System.out.println("el área del rectangulo es: " + r1.calcularArea());
        
        Rectangulo r2 = new Rectangulo();
        r2.setLado1(8);
        r2.setLado2(5);
         System.out.println("el área del rectangulo es: " + r2.calcularArea());
        
    }
    
}
