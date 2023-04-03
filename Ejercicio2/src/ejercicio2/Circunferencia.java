
package ejercicio2;

import ejercicio2.Circunf.Entidades;


public class Circunferencia {

    /*
    Declarar una clase llamada Circunferencia que tenga como atributo privado
el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    */
    public static void main(String[] args) {
       
        
        Entidades n1 = new Entidades(4);
        
        System.out.println("el area de la circunferencia es: "+ n1.area());
        System.out.println("el perímetro de la circunferencia es. " + n1.perimetro());
        
        System.out.println("*******************************");
        Entidades n2 = new Entidades(6);
        
        System.out.println("el area de la circunferencia es: "+ n2.area());
        System.out.println("el perímetro de la circunferencia es. " + n2.perimetro());
    }
    
}
