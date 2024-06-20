package escuela;

public class Cursos {

    private String nombre;
    private String categoria;
    private String periodo;

    //MÉTODO CONSTRUCTOR
    public Cursos(String materia, String categoria, String periodo){
        this.nombre = materia;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    //MÉTODOS GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getPeriodo() {
        return periodo;
    }

    //MÉTODOS SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    //MÉTODO ToSTRING
    @Override
    public String toString() {return "NOMBRE: "+nombre+" CATEGORIA: "+categoria+" PERIODO: "+periodo;}
}
