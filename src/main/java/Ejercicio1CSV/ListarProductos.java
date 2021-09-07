package Ejercicio1CSV;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListarProductos {


    static List<Producto> productos = new ArrayList<>();

    public static void listar() throws IOException {

        String fileName = ("/Users/data/Products.csv");


        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> productosFile = reader.readAll();
            //r.forEach(x -> System.out.println(Arrays.toString(x)));

            for (String[] producto : productosFile) {
                Producto prod = new Producto();
                prod.setId(producto[0]);
                prod.setAmountMax(producto[1]);
                prod.setAmountMin(producto[2]);
                prod.setDisponibilidad(producto[3]);
                prod.setEstado(producto[4]);
                prod.setCurrency(producto[5]);
                prod.setFechavista(producto[6]);
                prod.setVendido(producto[7]);
                prod.setComerciante(producto[8]);
                prod.setEnvio(producto[9]);
                prod.setUrl(producto[10]);
                prod.setAsins(producto[11]);
                prod.setBrand(producto[12]);
                prod.setCategoria(producto[13]);
                prod.setDateadded(producto[14]);
                prod.setDataUpdated(producto[15]);
                prod.setEan(producto[16]);
                prod.setImagenURL(producto[17]);
                prod.setKeys(producto[18]);
                prod.setManofacturer(producto[19]);
                prod.setManofacturernumbre(producto[20]);
                prod.setName(producto[21]);
                prod.setPrimarycategory(producto[22]);
                prod.setSourceURL(producto[23]);
                prod.setUpc(producto[24]);
                prod.setWeight(producto[25]);
                productos.add(prod);
            }

        } catch (CsvException e) {
            e.printStackTrace();
        }
    }

    public static void buscarCodigo(String cod) throws IOException{

        String codigo = cod;
        int pos = -1;

        for (int i = 1; i < productos.size() ; i++) {
            if (productos.get(i).getId().equals(codigo)) {
                pos = i;
                System.out.println("Producto Encontrado\n" + productos.get(i));
            }
        }
        if (pos == -1){
            System.out.println("Producto no Encotrado");
        }

    }

    public static void buscarNombre(String nomb) throws IOException{

        String nombre = nomb;
        int pos = -1;

        for (int i = 1; i < productos.size() ; i++){
            if(productos.get(i).getName().contains(nombre)){
                pos = i;
                System.out.println("Producto Encontrado, para mayor exactitud especifique su busqueda:\n" +"ID: "+ productos.get(i).getId() +"\nNombre: "+ productos.get(i).getName() +"\n");
            }}
        if (pos == -1){
            System.out.println("Producto no Encotrado");
        }


    }

        }




