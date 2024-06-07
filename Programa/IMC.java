package Programa;
import java.util.Scanner;
public class IMC {
    public static void programaIMC(){

        //DATOS
        System.out.println("\n-----------------CALCULADORA DE IMC------------------");
        System.out.println("\n──INGRESE LOS SIGUIENTES DATOS──\n");

        Scanner IntoDatos = new Scanner(System.in);
        System.out.print("Peso (kg): ");
        double peso = IntoDatos.nextDouble();
        System.out.print("Altura (m): ");
        double altura = IntoDatos.nextDouble();

        //PROCESO
        double IMC = CalcularIMC(peso,altura);

        //RESULTADO

        System.out.println("\n--> IMC: "+IMC);


        System.out.println("---------------------------");
        if (IMC < 18.5){
            System.out.println("--> IMC bajo");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("--> IMC Normal");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println("--> IMC Sobrepeso");
        } else if (IMC > 30 && IMC < 34.9) {
            System.out.println("--> IMC Obesidad I");
        } else if (IMC > 35 && IMC < 39.9) {
            System.out.println("--> IMC Obesidad II");
        }else if (IMC > 40 && IMC < 49.9) {
            System.out.println("--> IMC Obesidad III");
        }else if (IMC > 50) {
            System.out.println("--> IMC Obesidad IV");
        }

    }

    public static double CalcularIMC(double peso, double altura){

        double IMC = peso/(altura*altura);

        return IMC;
    }




}
