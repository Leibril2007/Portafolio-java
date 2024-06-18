package libros;

import mis_metodos.MisMetodos;

public class Biblioteca {

    public static void programa(){

        Libro libro1 = new Libro("Viaje al Centro de la Tierra","Julio Verne","1994");
        Libro libro2 = new Libro("El Hombre que Calculaba","Júlio César de Mello e Souza","1938");
        Libro libro3 = new Libro("El Principito","Antoine de Saint-Exupéry","1943");
        Libro libro4 = new Libro("Carazamba","Virgilio Rodríguez Macal","1953");
        Libro libro5 = new Libro("Fuenteovejuna","Félix Lope de Vega","1610");
        Libro libro6 = new Libro("El Señor Presidente","Miguel Ángel Asturias","1946");
        Libro libro7 = new Libro("El Lazarillo de Tormes","Anónimo","1969");
        Libro libro8 = new Libro("La Tentativa del León y el Éxito de su Empresa","Matías de Córdova","1973");
        Libro libro9 = new Libro("Me llamo Rigoberta Menchú y así me nació la conciencia","Rigoberta Menchú y Elizabeth Burgos","1983");
        Libro libro10 = new Libro("Bajo la Misma Estrella","John Green","2012");

        //MOSTRAR INFORMACIÓN DE TITULOS DEL LIBRO USANDO EL MÉTODO GET
        System.out.println("\nTITULOS DE LOS LIBROS\n");

        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro3.getTitulo());
        System.out.println(libro4.getTitulo());
        System.out.println(libro5.getTitulo());
        System.out.println(libro6.getTitulo());
        System.out.println(libro7.getTitulo());
        System.out.println(libro8.getTitulo());
        System.out.println(libro9.getTitulo());
        System.out.println(libro10.getTitulo());

        MisMetodos.imprimirLinea();

        //MOSTRAR INFORMACIÓN DE AUTORES DEL LIBRO USANDO EL MÉTODO GET
        System.out.println("\nAUTORES DE LOS LIBROS\n");

        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        MisMetodos.imprimirLinea();

        //MOSTRAR INFORMACIÓN DE FECHA DEL LIBRO USANDO EL MÉTODO GET
        System.out.println("\nFECHAS DE LOS LIBROS\n");

        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());

        MisMetodos.imprimirLinea();

        //MOSTRAR INFORMACIÓN DE LOS LIBROS USANDO EL MÉTODO TOSTRING
        System.out.println("\nINFORMACIÓN DE LOS LIBROS USANDO TOSTRING\n");

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
        System.out.println(libro6.toString());
        System.out.println(libro7.toString());
        System.out.println(libro8.toString());
        System.out.println(libro9.toString());
        System.out.println(libro10.toString());

        MisMetodos.imprimirLinea();

        //MOSTRAR INFORMACIÓN DEL CAMBIO DEL AUTOR DEL LIBRO 1 USANDO EL MÉTODO SET
        System.out.println("\nCAMBIO DEL AUTOR DEL LIBRO 1\n");

        libro1.setAutor("Ariel Subuyuj");
        System.out.println(libro1);
    }
}
