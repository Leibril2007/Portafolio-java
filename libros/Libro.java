package libros;

public class Libro {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private String fecha;

    //MÉTODO CONSTRUCTOR
    public Libro(String titulo, String autor, String fecha){
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    //MÉTODOS DE TIPO GET

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getFecha(){
        return fecha;
    }

    //MÉTODO TOSTRING

    public String toString(){
        return "Título: "+ titulo +", Autor: " + autor + ", Fecha: "+fecha;
    }


    //MÉTODOS DE TIPO SET
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

}
