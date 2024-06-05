package lista;

import Opciones.Lista_opciones;

import java.util.Scanner;

//LIBRERIAS PARA LISTA
import java.util.ArrayList;
import java.util.List;
public class ListaDeCompras {


    public static String[] opciones = {"Lista de compras", "Salir"};

    //PROGRAMA INICIAL
    public static void programa(){
        Lista_opciones.cargarOpciones(opciones);

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int resp = opcion.nextInt();

        switch (resp){
            case 1:
                crearLista();
                break;
            case 2:
                System.out.println("Opción 2");
                break;
        }

    }

    // OPCION 1 CREAR LISTA DE COMPRAS
    public static void crearLista(){
        List<String> listaVacia = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();

        String resProduc;
        double resPrecio;

        for (int i = 1; i<=3; i++){
            Scanner item = new Scanner(System.in);
            System.out.print("PRODUCTO: ");
            resProduc = item.nextLine();
            System.out.print("PRECIO: ");
            resPrecio = item.nextDouble();

            //AGREGAR A LA LISTA VACIA
            listaVacia.add(resProduc);
            listaPrecio.add(resPrecio);
        }

        //MOSTRAR LISTA
        System.out.println(listaVacia + "-->" + listaPrecio);


    }

}
