package Conversor_de_Moneda;
import Opciones.Lista_opciones;
import java.util.Scanner;

public class ConversorMoneda {

    public static void programa(){
        System.out.println("\n-----------------CONVERSOR DE MONEDA------------------");
        System.out.println("CONVERSIONES DISPONIBLES: ");
        System.out.println();
        String[] operaciones = {"Quetzales a Dólares","Dolares a Quetzales","Quetzales a Pesos Mexicanos","Pesos Mexicanos a Quetzales"};

        Lista_opciones.cargarOpciones(operaciones);

        System.out.println();

        Scanner opcionAelegir = new Scanner(System.in);
        System.out.print("¿Cuál desea?: ");
        int opcion = opcionAelegir.nextInt();

        System.out.println();

        switch (opcion){
            case 1:
                System.out.println("-------------QUETZALES A DOLARES---------------");

                Scanner ingQ = new Scanner(System.in);
                System.out.print("Ingrese los Quetzales: ");
                double quetzales = ingQ.nextDouble();

                System.out.println("\nRESULTADO: "+"$ "+quetADol(quetzales));
                System.out.println();

                break;
            case 2:
                System.out.println("-------------DÓLARES A QUETZALES---------------");

                Scanner ingd = new Scanner(System.in);
                System.out.print("ingrese los Dólares: ");
                double dolares = ingd.nextDouble();

                System.out.println("\nRESULTADO: "+"Q "+dolAquet(dolares));
                System.out.println();

                break;
            case 3:
                System.out.println("-------------QUETZALES A PESOS MEXICANOS---------------");

                Scanner ingquet = new Scanner(System.in);
                System.out.print("Ingrese los quetzales: ");
                double quet = ingquet.nextDouble();

                System.out.println("\nRESULTADO: "+"MX$ "+quetApesos(quet));
                System.out.println();

                break;
            case 4:
                System.out.println("-------------PESOS MEXICANOS A QUETZALES---------------");

                Scanner ingpesos = new Scanner(System.in);
                System.out.print("Ingrese los quetzales: ");
                double pesosM = ingpesos.nextDouble();

                System.out.println("\nRESULTADO: "+"Q "+pesosAquet(pesosM));
                System.out.println();

                break;
        }
    }

    public static double quetADol(double quetzales){
        double conversion = quetzales*(1/7.5);
        return conversion;
    }

    public static double dolAquet(double dolares){
        double conversion = dolares*(7.76096);
        return conversion;
    }

    public static double quetApesos(double quet){
        double conversion = quet*(2.38585);
        return conversion;
    }

    public static double pesosAquet(double pesosM){
        double conversion = pesosM*(0.419137);
        return conversion;
    }


}
