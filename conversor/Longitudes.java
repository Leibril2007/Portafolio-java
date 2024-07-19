package conversor;
import mis_metodos.ListaDeOpciones;


import java.util.Scanner;

public class Longitudes {
    public static void longitud() {

        System.out.println("\n-----------------CONVERSOR DE LONGITUDES------------------");

        System.out.println("\nOperaciones Disponibles: \n");
        String[] operacion = {"Km/m", "m/Km", "Km/cm", "cm/km"};

        ListaDeOpciones.cargarOpciones(operacion);


        Scanner seleccion = new Scanner(System.in);
        System.out.print("\n¿Cuál desea? ");
        int opciones = seleccion.nextInt();

        //proceso
        Scanner datos = new Scanner(System.in);
        System.out.print("Dato a convertir: ");
        double num1 = datos.nextDouble();

        System.out.println();

        switch (opciones) {
            case 1:

                System.out.println("Respuesta en metros: " + Metros(num1));
                break;

            case 2:

                System.out.println("Respuesta en Km: " + Kilometro(num1));
                break;
            case 3:
                System.out.println("Respuesta en cm: " + Centimetros(num1));
                break;
            case 4:
                System.out.println("Respuesta en km: " + kilometron(num1));
                break;
        }
    }

    public static double Metros(double num1) {
        double Metros = num1 * 1000;
        return Metros;
    }

    public static double Kilometro(double num1) {
        double kilometro = num1 / 1000;
        return kilometro;
    }

    public static double Centimetros(double num1) {
        double Centimetros = num1 * 100000;
        return Centimetros;
    }

    public static double kilometron(double num1) {
        double kilometron = num1 / 100000;
        return kilometron;

    }
}