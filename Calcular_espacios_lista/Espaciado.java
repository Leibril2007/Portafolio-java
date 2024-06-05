package Calcular_espacios_lista;

public class Espaciado {

    public static int espacio_lista(int numeroDeCaracteres, String [] opciones ){

        //ALMACENA LA PRIMERA PALABRA DE LA LISTA
        int numeroCaracteres = numeroDeCaracteres;

        //COMPARACION PARA ENCONTRAR LA PALABRA MAYOR PARA DAR EL NUMERO DE ESPACIOS

        /*
         * Compara la longitud de cada palabra de la lista con la primera palabra establecida.
         * Esta será reemplazada si encuentra otra palabra mayor y esa será utilizada
         * Para dar los espacios correspondientes
         * */

        for (int i=0; i<opciones.length;i++){

            int numeroCaracteres2=opciones[i].length();

            if (numeroCaracteres2 > numeroCaracteres){

                numeroCaracteres=opciones[i].length();

            }
        };

        return numeroCaracteres;

    }



}
