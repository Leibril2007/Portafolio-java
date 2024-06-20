package escuela;

public class Estudiantes {

    private String nombre;
    private String correo;
    private String carrera;
    private int edad;
    private boolean solvencia;

    //MÉTODO CONSTRUCTOR
    public Estudiantes(String nombre, String correo, String carrera, int edad, boolean solvencia){
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
        this.solvencia = solvencia;
    }

    //METODOS GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getEdad() {
        return edad;
    }
    public boolean getSolvencia(){
        return  solvencia;
    }

    //METODOS SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSolvencia(boolean solvencia) {
        this.solvencia = solvencia;
    }

    //METODO ToSTRING
    public String toString() {return "NOMBRE: "+nombre + " CORREO: " + correo + " CARRERA: "+carrera +" EDAD: " + edad + " SOLBENCIA: "+solvencia;};


}
