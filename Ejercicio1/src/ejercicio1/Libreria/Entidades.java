
package ejercicio1.Libreria;

public class Entidades {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPags;

    public Entidades() {
    }

    public Entidades(String isbn, String titulo, String autor, int numPags) {
        if(isbn.length() ==13){
        this.isbn = isbn;
        }else{
            System.out.println("Ingrese otro ISBN");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPags() {
        return numPags;
    }

   
 
    public void mostrarLibro(){
        System.out.println("***********************");
        System.out.println("ISBN : " + this.isbn);
        System.out.println("Titulo : " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPags);
        System.out.println("****************************");
    }
}