package calculadora;

import mis_metodos.ListaDeOpciones;
import mis_metodos.MisMetodos;

import java.util.Scanner;

public class Mate {

    public static void programa(){

        System.out.println("\n-----------------CALCULADORA------------------\n");
        System.out.println("OPERACIONES DISPONIBLES: ");
        System.out.println();
        String[] operaciones = {"Sumar","Restar","Multiplicar","Dividir"};

        ListaDeOpciones.cargarOpciones(operaciones);

        System.out.println();

        //ELECCIÓN DE LA OPCIÓN
        Scanner opcionAelegir = new Scanner(System.in);
        System.out.print("¿Cuál desea?: ");
        int opcion = opcionAelegir.nextInt();

        System.out.println();

        //FUNCION DE LAS OPCIONES ELEGIDAS
        switch (opcion){
            case 1:
                System.out.println("-------------SUMA---------------");

                Scanner ingNum = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num1 = ingNum.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = ingNum.nextInt();

                MisMetodos.imprimirLinea();
                System.out.println("RESULTADO: "+sumar(num1, num2));

                break;
            case 2:
                System.out.println("-------------RESTA---------------");

                Scanner ingNum2 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num3 = ingNum2.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num4 = ingNum2.nextInt();

                System.out.println("\nRESULTADO: "+restar(num3, num4));
                System.out.println();

                break;
            case 3:
                System.out.println("-------------MULTIPLICAR---------------");


                Scanner ingNum3 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num5 = ingNum3.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num6 = ingNum3.nextInt();

                System.out.println("\nRESULTADO: "+multiplicar(num5, num6));
                System.out.println();
                break;
            case 4:

                System.out.println("-------------DIVIDIR---------------");

                Scanner ingNum4 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num7 = ingNum4.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num8 = ingNum4.nextInt();

                System.out.print("\nRESULTADO: "+dividir(num7, num8));
                System.out.println();

                break;
        }
    }

    //FUNCIONES
    public static int sumar(int num1, int num2){
        int sumar_num = num1+num2;
        return sumar_num;
    }
    public static int restar(int num1, int num2){
        int restar_num = num1-num2;
        return restar_num;
    }

    public static double dividir(double num1, double num2){
        double dividir = num1/num2;
        return dividir;
    }

    public static int multiplicar(int num1, int num2){
        int multi = Math.multiplyExact(num1, num2);
        return multi;
    }



}
