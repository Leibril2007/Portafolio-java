package calculadora;

import java.util.Scanner;

public class CalcularLaEdad {

    public static void programa(){

        System.out.println("\n-----------------CALCULADORA DE EDAD------------------");
        System.out.println("\n──INGRESE LOS DATOS SOLICITADOS──\n");

        Scanner datos = new Scanner(System.in);
        System.out.print("Día en el que nació: ");
        int diaNac = datos.nextInt();

        System.out.print("Mes en el que nació: ");
        int mesNaci = datos.nextInt();

        System.out.print("Año en el que nació: ");
        int annoNaci = datos.nextInt();
        System.out.println();

        //DATOS ACTUALES

        Scanner diaActual = new Scanner(System.in);
        System.out.print("Día actual: ");
        int diaAc = diaActual.nextInt();

        System.out.print("Mes actual: ");
        int mesAc = diaActual.nextInt();

        System.out.print("Año actual: ");
        int annoActual = diaActual.nextInt();

        System.out.println("\nTu edad es: "+calc_por_nac(annoActual, annoNaci, mesNaci, mesAc, diaAc, diaNac)+" años");
    }


    public static int calc_por_nac(int annoActual,int annoNaci, int mesNaci, int mesAc, int diaAc, int diaNac) {

        int edad = annoActual - annoNaci;

        if (mesNaci > mesAc){
            edad = edad - 1;

        } else {
            if (mesNaci == mesAc){
                edad = edad;
            }
            if (diaNac == diaAc){
                System.out.println("\nFELICIADES EL DIA DE HOY ESTAS CUMPLIENDO AÑOS!!");
            }
        }

        return edad;
    }



}
