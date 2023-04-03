
package ejercicio4extras;

import clientes.Clientes;

/*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
    crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
    del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después 
    de realizar una transacción de retiro.
    */
public class Ejercicio4Extras {

   
    public static void main(String[] args) {
       
        Clientes c1 = new Clientes();
        c1.setTitular("Francisco");
        c1.AgregarSaldo(2000);
        c1.retirarDinero(1500);
        
    }
    
}
