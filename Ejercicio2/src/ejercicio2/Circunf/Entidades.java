package ejercicio2.Circunf;




public class Entidades {


  private double radio;
    
    public Entidades (double radio){
        this.radio=radio;
    }
    
    public void setter(double radio){
        this.radio=radio;
    }
    public double getter(){
        return radio;
    }
    public double area(){
        double area= Math.PI * radio *radio;
        return area;
    }
    public double perimetro(){
        double perimetro=2*Math.PI*radio;
        return perimetro;
    }
}
