package escuela;

public class PrimeroPrimaria {

    public static void programa(){
        //ESTUDIANTES
        Estudiantes estudiante1 = new Estudiantes("María Zuleca", "mariZul@scl.edu.gt", "Primero primaria", 6, false);
        Estudiantes estudiante2 = new Estudiantes("José Alvarado", "joS@scl.edu.gt", "Primero primaria", 7, true);
        Estudiantes estudiante3 = new Estudiantes("Sofía Villalobos", "soF@scl.edu.gt", "Primero primaria", 7, false);
        Estudiantes estudiante4 = new Estudiantes("Amalia López", "AmaLop@scl.edu.gt", "Primero primaria", 6, true);
        Estudiantes estudiante5 = new Estudiantes("Janeth Paz", "JPaz@scl.edu.gt", "Primero primaria", 6, false);

        System.out.println("\n--------------------NOMBRES Y CORREOS DE LOS ALUMNOS----------------------\n");

        System.out.println("NOMBRE: "+estudiante1.getNombre()+"; CORREO: "+estudiante1.getCorreo());
        System.out.println("NOMBRE: "+estudiante2.getNombre()+"; CORREO: "+estudiante2.getCorreo());
        System.out.println("NOMBRE: "+estudiante3.getNombre()+"; CORREO: "+estudiante3.getCorreo());
        System.out.println("NOMBRE: "+estudiante4.getNombre()+"; CORREO: "+estudiante4.getCorreo());
        System.out.println("NOMBRE: "+estudiante5.getNombre()+"; CORREO: "+estudiante5.getCorreo());

        //CURSOS
        Cursos cursoEstudiante1 = new Cursos("Educación musical","Artes", "Período II");
        Cursos cursoEstudiante2 = new Cursos("Comunicación y Lenguaje","Ciencia computacional", "Período I");
        Cursos cursoEstudiante3 = new Cursos("Formación Ciudadana","Artes", "Período III");
        Cursos cursoEstudiante4 = new Cursos("Matemáticas","Ciencia formal", "Período II");

        System.out.println("\n-----------------CURSOS---------------------\n");

        System.out.println("○ "+cursoEstudiante1.getNombre());
        System.out.println("○ "+cursoEstudiante2.getNombre());
        System.out.println("○ "+cursoEstudiante3.getNombre());
        System.out.println("○ "+cursoEstudiante4.getNombre());

    }

}
