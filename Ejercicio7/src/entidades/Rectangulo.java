
package entidades;


public class Rectangulo {
  
    private int lado1;
    private int lado2;
    
    public Rectangulo() {
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public int calcularArea(){
      int area=lado1*lado2;
        return area; 
    }

    
    
    
}
