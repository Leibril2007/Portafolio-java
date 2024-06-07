//importar del nombrePaquete.nombreClase
import Farenheit_Centigrados.ConversionFarenheitCentigrados;
import Matematicas.Mate;
import Opciones.Lista_opciones;
import interfaz_grafica.Banner;
import Calculadora_de_edad.calcular_edad;
import Programa.IMC;
import Conversor_de_unidades.Conversor;
import lista.ListaDeCompras;
// importar de nombreLibreria.NombrePaquete.NombreClase
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Fahrenheit / Celsius", "Calculadora de edad",
                "Conversor de unidades", "Lista de compras",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir"
        };


        boolean programa = true;

       do{
           Banner.mensaje();
           Lista_opciones.cargarOpciones(listaDeOpciones);

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
                   ConversionFarenheitCentigrados.programa();

                   break;
               case 4:
                   calcular_edad.programa();

                   break;
               case 5:
                   Conversor.programaConversor();

                   break;
               case 6:
                   ListaDeCompras.programa();

                   break;
               case 7:
                   System.out.println("Opción 7");
                   programa = false;

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