
package operacion;


public class Operacion {
    private int num;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum() {
        return num;
    }

    public int getNum2() {
        return num2;
    }
    
    public int suma(){
      return num+num2;
  }
    public int multiplicar(){
        return num*num2;
    }
    
    public int resta(){
        return num-num2;
    }
    public int dividir(){
           if (num2==0){
            return 0;
        }else{
         return num/num2;
        }
    }
}

 