package Farenheit_Centigrados;

import Opciones.Lista_opciones;

import java.util.Scanner;

public class ConversionFarenheitCentigrados {

    public static void programa(){

        System.out.println("\n-----------------CONVERSOR------------------");

        System.out.println("Elige una opción: ");
        System.out.println();
        String[] operaciones = {"F/C","C/F"};

        Lista_opciones.cargarOpciones(operaciones);

        Scanner opcionAelegir = new Scanner(System.in);
        System.out.print("¿Qué desea convertir?: ");
        int opcion = opcionAelegir.nextInt();

        switch (opcion){
            case 1:
                Scanner Farenheit = new Scanner(System.in);
                System.out.print("Farenheit: ");
                double FarenheitDado = Farenheit.nextDouble();

                System.out.println("\nEL RESULTADO EN GRADOS CELSIUS ES: "+convertir_F_A_C(FarenheitDado));
                System.out.println();
                break;
            case 2:
                Scanner Celsius = new Scanner(System.in);
                System.out.print("Celsius: ");
                double CelsiusDado = Celsius.nextDouble();

                System.out.println("\nEL RESULTADO EN GRADOS FARENHEIT ES: "+convertir_C_A_F(CelsiusDado));
                System.out.println();
                break;
        }
    }


    public static double convertir_C_A_F(double celsius){
        double ConF = (celsius*9/5)+32;
        return ConF;
    }

    public static double convertir_F_A_C(double fahrenheit){
        double convertir = (0.555555555556*(fahrenheit - 32));
        return convertir;
    }


}







