package Ejercicio1CSV;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ListarProductos.listar();


        int menu = 0;
        System.out.println("Bienvenidos");
        while (menu != 10){
        System.out.println("Por Favor dijite la opción deseada");
        System.out.println("1- Buscar Producto por código");
        System.out.println("2- Buscar Producto por Nombre");
        menu = input.nextInt();
        input.nextLine();



            switch (menu){
                case 1:{
                    System.out.println("Digite el Codigo a ser Buscado");
                    String Codigo = input.nextLine();
                    ListarProductos.buscarCodigo(Codigo);
                    break;}
                case 2:{
                    System.out.println("Digite El nombre del producto");
                    String Nombre = input.nextLine();
                    ListarProductos.buscarNombre(Nombre);
                    break;
                }


            }

        }
    }}

