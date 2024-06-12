//importar del nombrePaquete.nombreClase
import conversor.ConversorDeGrados;
import calculadora.Mate;
import mis_metodos.ListaDeOpciones;
import interfaz_grafica.Banner;
import calculadora.CalcularLaEdad;
import IMC.IMC;
import conversor.Longitudes;
import lista.ListaDeCompras;
import conversor.ConversorMoneda;
// importar de nombreLibreria.NombrePaquete.NombreClase
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Fahrenheit / Celsius", "Calculadora de edad",
                "Conversor de unidades", "Lista de compras",
                "Conversor de Moneda", "opcion 8",
                "Opción_9", "Salir"
        };


        boolean programa = true;

       do{
           Banner.mensaje();
           ListaDeOpciones.cargarOpciones(listaDeOpciones);

           //PEDIR UNA OPCION

           Scanner intOpcion = new Scanner(System.in);
           System.out.print("[?]: ");
           int opcion = intOpcion.nextInt();
           System.out.println("─────────────────────────────────────────────");

           //CARGAR OPCIÓN DEL USUARIO

           switch (opcion){
               case 1:
                   Mate.programa();
                   break;
               case 2:
                   IMC.programaIMC();

                   break;
               case 3:
                   ConversorDeGrados.programa();

                   break;
               case 4:
                   CalcularLaEdad.programa();

                   break;
               case 5:
                   Longitudes.programaConversor();

                   break;
               case 6:
                   ListaDeCompras.programa();

                   break;
               case 7:
                   ConversorMoneda.programa();

                   break;
               case 8:
                   System.out.println("Opción 8");
                   programa = false;

                   break;
               case 9:
                   System.out.println("Opción 9");
                   programa = false;

                   break;
               case 10:
                   programa = false;
                   break;
           }
       }while (programa);
    }
}