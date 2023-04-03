
package cancionn;


public class Cancion {
  
private String titulo;
private String autor;

public Cancion(){
    this.titulo=" ";
    this.autor=" ";
}
public Cancion(String titulo,String autor){
    this.titulo=titulo;
    this.autor=autor;
}

public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
public void SetTitulo(String titulo){
    this.titulo=titulo;
}
public void SetAutor(String autor){
    this.autor=autor;
}
}
