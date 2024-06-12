package conversor;

import java.util.Scanner;

public class Longitudes {

    public static void programaConversor(){

        System.out.println("\n-----------------CONVERSOR DE UNIDADES------------------");

        System.out.println("\nElige una opción: \n");

        String[] listaDeOpciones = {
                "Longitud","Volumen","Peso"
        };


        for (int i = 0; i < listaDeOpciones.length; i++){
            System.out.printf("[%d] %s", i + 1, listaDeOpciones[i]);

            if ((i+1)%1 == 0){
                System.out.println();
            }

        }

        //ELECCION DE OPCION
        Scanner opcionAelegir = new Scanner(System.in);
        System.out.print("\n¿Cuál desea?: ");
        int opcion = opcionAelegir.nextInt();


        //INGRESO DE OPCIONES

        boolean programa = true;

        switch (opcion){
            case 1:
                System.out.println("\n---------CONVERSOR DE LONGITUD---------");

                System.out.println("\nElige una opción: \n");


                String[] listaDeLongitud = {
                        "Metros a centimetros","Centimetros a metros"
                };

                for (int i = 0; i < listaDeLongitud.length; i++){
                    System.out.printf("[%d] %s", i + 1, listaDeLongitud[i]);

                    if ((i+1)%1 == 0){
                        System.out.println();
                    }

                }

                Scanner opcionAelegirL = new Scanner(System.in);
                System.out.print("\n¿Cuál desea?: ");
                int opcionLongi = opcionAelegirL.nextInt();

                switch (opcionLongi){
                    case 1:
                        Scanner metDat = new Scanner(System.in);
                        System.out.print("\nMetros: ");
                        int metro = metDat.nextInt();

                        System.out.println("EL RESULTADO EN CENTIMETROS ES: "+metro_cetimetro(metro));
                        break;
                    case 2:
                        Scanner cenDat = new Scanner(System.in);
                        System.out.print("\nCentímetros: ");
                        int centimetro = cenDat.nextInt();

                        System.out.println("EL RESULTADO EN METROS ES: "+centimetro_metro(centimetro));
                        break;
                }

            case 2:
                System.out.println("\n---------CONVERSOR DE VOLUMEN---------");

                System.out.println("\nElige una opción: \n");


                String[] listaDeVol = {
                        "Litro a mililitro","Mililitro a litro"
                };

                for (int i = 0; i < listaDeVol.length; i++){
                    System.out.printf("[%d] %s", i + 1, listaDeVol[i]);

                    if ((i+1)%1 == 0){
                        System.out.println();
                    }

                }

                Scanner opcionAelegirV = new Scanner(System.in);
                System.out.print("\n¿Cuál desea?: ");
                int opcionV = opcionAelegirV.nextInt();

                switch (opcionV){
                    case 1:
                        Scanner metDat = new Scanner(System.in);
                        System.out.print("\nLitros: ");
                        int litros = metDat.nextInt();

                        System.out.println("EL RESULTADO EN MILILITROS ES: "+litro_mili(litros));
                        break;
                    case 2:
                        Scanner cenDat = new Scanner(System.in);
                        System.out.print("\nMililitro: ");
                        int centimetro = cenDat.nextInt();

                        System.out.println("EL RESULTADO EN LITROS ES: "+mili_litro(centimetro));
                        break;
                }
                break;
            case 3:
                System.out.println("\n---------CONVERSOR DE PESO---------");

                System.out.println("\nElige una opción: \n");


                String[] listaDePeso = {
                        "Kilogramo a gramo","Gramo a kilogramo"
                };

                for (int i = 0; i < listaDePeso.length; i++){
                    System.out.printf("[%d] %s", i + 1, listaDePeso[i]);

                    if ((i+1)%1 == 0){
                        System.out.println();
                    }

                }

                Scanner opcionAelegirP = new Scanner(System.in);
                System.out.print("\n¿Cuál desea?: ");
                int opcionPe = opcionAelegirP.nextInt();

                switch (opcionPe){
                    case 1:
                        Scanner pDat = new Scanner(System.in);
                        System.out.print("\nKilogramo: ");
                        int kilogramo = pDat.nextInt();

                        System.out.println("EL RESULTADO EN GRAMOS ES: "+kilo_g(kilogramo));
                        break;
                    case 2:
                        Scanner gDat = new Scanner(System.in);
                        System.out.print("\nGramo: ");
                        int gramo = gDat.nextInt();

                        System.out.println("EL RESULTADO EN KILOGRAMOS ES: "+g_kilo(gramo));
                        break;
                }
                break;

        }




    }

    public static int metro_cetimetro(int metro){

        int metro_a_centi = metro * 100;
        return metro_a_centi;

    }

    public static int centimetro_metro(int centimetro){

        int centi_a_metro = (centimetro / 100);
        return centi_a_metro;

    }

    public static int litro_mili(int litro){

        int litro_a_mili = litro * 1000;
        return litro_a_mili;

    }

    public static int mili_litro(int mililitro){

        int mili_a_lit = mililitro / 1000;
        return mili_a_lit;

    }

    public static int g_kilo(int gramo){

        int gramo_a_kilog = gramo / 1000;
        return gramo_a_kilog;

    }

    public static int kilo_g(int kilogramo){

        int kilo_a_gramo = kilogramo * 1000;
        return kilo_a_gramo;

    }


}
