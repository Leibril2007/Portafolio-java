//importar del nombrePaquete.nombreClase
import escuela.PrimeroPrimaria;
import conversor.ConversorDeGrados;
import calculadora.Mate;
import mis_metodos.ListaDeOpciones;
import interfaz_grafica.Banner;
import calculadora.CalcularLaEdad;
import IMC.IMC;
import conversor.Longitudes;
import lista.ListaDeCompras;
import conversor.ConversorMoneda;
import mis_metodos.MisMetodos;
import libros.Biblioteca;
// importar de nombreLibreria.NombrePaquete.NombreClase
import java.awt.*;
import java.util.Scanner;
import javax.swing.*; //el asterisco es que le traiga TODAS las clases de la libreria Swing, porque sino se ubiera colocado solo javax.swing.JFrame para una ventana o para un texto javax.swing.Jlabel pero sería uno por uno, para más facilidad se usó *, para proyectos más a futuro

public class Main {
    public static void main(String[] args) {

        //LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Fahrenheit / Celsius", "Calculadora de edad",
                "Conversor de unidades", "Lista de compras",
                "Conversor de Moneda", "Biblioteca",
                "Escuela", "Salir"
        };

        //SECCION GRAFICA


        JFrame miVentana = new JFrame("");
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(600, 600);
        miVentana.setLayout(new BorderLayout());

        //SECCION DEL BANNER
        JLabel textoBanner = new JLabel("Ariel Subuyuj", SwingConstants.CENTER);
        textoBanner.setFont(new Font("Calibri", Font.BOLD, 40));

        //SECCION DE LAS OPCIONES
        JPanel listOpciones = new JPanel();
        listOpciones.setBounds(50,100,500,300);
        miVentana.add(listOpciones);

        JLabel textoOpciones = new JLabel();
        textoOpciones.setText("[1]"+" Calculadora");
        textoOpciones.setBounds(100,0,200,250);
        listOpciones.add(textoOpciones);

        JLabel textoOpciones2 = new JLabel();
        textoOpciones2.setText("[2]"+" IMC");
        textoOpciones2.setBounds(100,0,200,250);
        listOpciones.add(textoOpciones2);

        JLabel textoOpciones3 = new JLabel();
        textoOpciones3.setText("\n[3]"+" Fahrenheit / Celsius");
        textoOpciones3.setBounds(0,0,200,250);
        listOpciones.add(textoOpciones3);

        miVentana.add(textoBanner, BorderLayout.NORTH);

        //SECCION DEL BOTON
        JPanel seccionBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton boton = new JButton("Boton");
        seccionBoton.add(boton);
        miVentana.add(seccionBoton, BorderLayout.SOUTH);

        miVentana.setVisible(true);



        boolean programa = true;

       do{
           MisMetodos.limpiarConsola();
           Banner.mensaje();
           MisMetodos.imprimirLinea();

           ListaDeOpciones.cargarOpciones(listaDeOpciones);

           //PEDIR UNA OPCION
           Scanner intOpcion = new Scanner(System.in);
           System.out.print("[?]: ");
           int opcion = intOpcion.nextInt();
           MisMetodos.imprimirLinea();

           //CARGAR OPCIÓN DEL USUARIO

           switch (opcion){
               case 1:
                   Mate.programa();
                   programa = false;
                   break;
               case 2:
                   IMC.programaIMC();
                   programa = false;

                   break;
               case 3:
                   ConversorDeGrados.programa();
                   programa = false;

                   break;
               case 4:
                   CalcularLaEdad.programa();
                   programa = false;

                   break;
               case 5:
                   Longitudes.longitud();
                   programa = false;

                   break;
               case 6:
                   ListaDeCompras.programa();
                   programa = false;

                   break;
               case 7:
                   ConversorMoneda.programa();
                   programa = false;

                   break;
               case 8:
                   Biblioteca.programa();
                   programa = false;

                   break;
               case 9:
                   PrimeroPrimaria.programa();
                   programa = false;

                   break;
               case 10:
                   programa = false;
                   break;
           }
       }while (programa);
    }
}