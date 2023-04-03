
package ejercicio3;

import operacion.Operacion;


public class Ejercicio3 {

    
    public static void main(String[] args) {
      Operacion n1 = new Operacion(20, 5);
        System.out.println("la suma de los número es: " + n1.suma());
        System.out.println("La multiplicación de los números es: "+ n1.multiplicar());
        System.out.println("La resta de los número es: " +n1.resta());
        System.out.println("La división de los números es: "+ n1.dividir());
    }
    
}
