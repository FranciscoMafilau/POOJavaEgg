
package Rectangulo;


public class Rectangulo {
    private int altura;
    private int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    
    public int superficie(){
        int superficie = base*altura;
        return superficie;
    }
    public int Perimetro(){
        int perimetro=base*2+altura*2;
        return perimetro;
    }
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
              
           
            System.out.print("*");
        }
            System.out.println(" ");
        }
    }
}
/*
package Entidades;


public class Rectangulo {
    private int altura;
    private int base;
    public Rectangulo(int altura,int base){
        this.altura=altura;
        this.base=base;
    }
    public void setbase(int base){
        this.base=base;
    }
    public void setlado(int altura){
        this.altura=altura;
    }
    public int Perimetro(){
        int perimetro=base*2+altura*2;
        return perimetro;
        
    }
    public int superficie(){
        int superficie=base*altura;
        return superficie;
        
    }
    public void Dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
    }
}
*/