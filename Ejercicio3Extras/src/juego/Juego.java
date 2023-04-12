
package juego;

import java.util.Scanner;

   /*
    Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
    jugadores jugar un juego de adivinanza de números. El primer jugador elige un 
    número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número
    limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
    El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
    Registra el número de intentos necesarios para adivinar el número y el número de veces
    que cada jugador ha ganado.
    */
public class Juego {
    
    private String jugador1;
    private String jugador2;
    private int num;
    private int numAdivinar;
    private int intentos;
    private int intentosNoAcertado;
    private int juegoGanado;
     private int conteoNumeros=5; ///contador de las veces que ingresa un numero jugador2

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int num, int numAdivinar, int intentos, int intentosNoAcertado, int juegoGanado, int conteoNumeros) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.num = num;
        this.numAdivinar = numAdivinar;
        this.intentos = intentos;
        this.intentosNoAcertado = intentosNoAcertado;
        this.juegoGanado = juegoGanado;
        this.conteoNumeros=5;
    }

 
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador número uno, ingrese su nombre: ");
        jugador1 = leer.nextLine();
         System.out.println("Jugador número dos, ingrese su nombre: ");
        jugador2 = leer.nextLine();
        System.out.println(jugador1+ " Introduca un número a adivinar: ");
        numAdivinar = leer.nextInt();
        
       
        boolean correcto =false;
        intentos=0;
        while(conteoNumeros>0 && !correcto){
            System.out.println(jugador2+" ingresa un número: ");
            num = leer.nextInt();
            System.out.println("Te quedan; " + conteoNumeros + " intentos");
            intentos++;
            if(numAdivinar==num){
                System.out.println(jugador2+" Adivinaste el número, Felicitaciones!!!!");
                intentosNoAcertado=0;
                intentosNoAcertado++;
                correcto = true;
                break;
            }else{
                if(numAdivinar < num){
                       System.out.println("El numero es más bajo \n");
                } else {
                    System.out.println("El numero es más alto \n");
                }
            
            conteoNumeros--;
        }
        }
           if (correcto == false) {
            System.out.println("¡Se acabaron los intentos! El número era " + numAdivinar + ".");
            juegoGanado++;
        }
           
      System.out.println(jugador1 +" ha ganado " + juegoGanado + " veces.");
            System.out.println(jugador2 + " ha ganado " + intentosNoAcertado + " veces, con " + intentos+ " intentos");
}  
}

/*
private int victoriasJugador1, victoriasJugador2, limiteIntentos;

    public Juego() {
        victoriasJugador1 = 0;
        victoriasJugador2 = 0;
        limiteIntentos = 5;
    }

    public int getVictoriasJugador1() {
        return victoriasJugador1;
    }

    public int getVictoriasJugador2() {
        return victoriasJugador2;
    }

    public int getLimiteIntentos() {
        return limiteIntentos;
    }

    public void setLimiteIntentos(int limiteIntentos) {
        this.limiteIntentos = limiteIntentos;
    }
    
    public void iniciar_juego(int numeroJugador1, Scanner sc){
        int numeroJugador2;
        int contadorIntento = 0;
        boolean bandera = false;
        do {            
            System.out.println("Jugador 2 ingrese un número");
            numeroJugador2 = sc.nextInt();
            if(numeroJugador1 < numeroJugador2){
                System.out.println("Es más bajo");
            } else if(numeroJugador1 > numeroJugador2){
                System.out.println("Es más alto");
            } else {
                bandera = true;
            }
            contadorIntento++;
        } while (numeroJugador1 != numeroJugador2 && contadorIntento < limiteIntentos);
        
        if(bandera){
            System.out.println("El jugador 2 adivinó el número");
            victoriasJugador2++;
        } else {
            System.out.println("El jugador 2  no adivinó el número, gana el jugador 1");
            victoriasJugador1++;
        }
    }





Scanner sc = new Scanner(System.in);
        Juego nuevo = new Juego();
        do {            
            System.out.println("Jugador 1 ingrese el número a adivinar");
            int num = sc.nextInt();
            nuevo.iniciar_juego(num, sc);
            
        } while (true);
*/