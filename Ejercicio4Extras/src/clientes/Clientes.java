
package clientes;


public class Clientes {
    
    private double saldo;
    private String titular;

    public Clientes() {
    }

    public void AgregarSaldo(double saldo) {///creo el método para que la cuenta tenga saldo
        this.saldo += saldo;
    }

    public void setTitular(String titular) {
        System.out.println("Ingrese su nombre :" + titular);
        this.titular = titular;
    }

    public String getTitular() {
        
        return titular;
    }
    
    
    public void retirarDinero(double montoRetirar){
        if ((saldo - montoRetirar)< 0 ){
            System.out.println("la operación no puede ser realizada");
        
        }else{
            System.out.println("saldo a favor: "+ (saldo - montoRetirar));
        }
       
    }
}
