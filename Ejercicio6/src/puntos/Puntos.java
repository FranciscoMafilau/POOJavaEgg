
package puntos;


public class Puntos {
   
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public Puntos(){
     }
    
    public void CrearPuntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
 public double CalcularDistancia(){
     double distancia;
     distancia=Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
     return distancia;
 }
 
}
