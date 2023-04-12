
package empleado;

import java.util.Scanner;

/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser del 10%
si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/
public class Empleado {
    String nombre;
    int edad;
    int salario;
    int aumento;
   

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario, int aumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.aumento = aumento;
      
    }




    
    public void calcularAumento(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nombre del empleado: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese edad:");
        edad = leer.nextInt();
        System.out.println("Ingrese salario:");
        salario = leer.nextInt();
        
       if(edad >30){
          aumento= (int) (salario*0.10);
          
       }else{
         aumento = (int) (salario*0.05);
          
        
       } salario =aumento+salario;
       System.out.println("el aumento que le corresponde es : " + (salario));
       
        }
    } 


