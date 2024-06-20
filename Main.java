//importar del nombrePaquete.nombreClase
import colegio.PrimeroPrimaria;
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
import java.util.Scanner;

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