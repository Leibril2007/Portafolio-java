package mis_metodos;

public class ListaDeOpciones {
//Carga y muestra las opciones en grupos de dos, cada grupo en una línea separada.

    public static void cargarOpciones(String[] opciones) {

        int elementoMasGrande = encontrarElementoMasGrande(opciones).length();

        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("[%d] %s ", i + 1, opciones[i]);

            for(int j = 0;j<(elementoMasGrande-opciones[i].length());j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");
            }
        }

    }


    public static String encontrarElementoMasGrande (String[] listaDeOpciones) {
    String elementoMasGrande = listaDeOpciones[0];

    for (String opcion : listaDeOpciones) {
        if (opcion.length() > elementoMasGrande.length()) {
            elementoMasGrande = opcion;
        }
    }

    return elementoMasGrande;
    }
}