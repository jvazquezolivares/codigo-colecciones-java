package curso.colecciones.listas.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class ArrayList1 {
    
    public static void main(String[] args) {
        //Creación de ArrayList
        List<String> listaColores = new ArrayList<>();
        
        //Creación mediante la clase Arrays
        String [] nombres = {"Arturo", "Daniel", "JAvier", "Gustavo", "Pamela"};
        
        List<String> listaNombres = Arrays.asList(nombres);
        
        //Adición de elemento individuales
        listaColores.add("Azul");
        listaColores.add("Amarillo");
        listaColores.add("Morado");
        
        //Construir lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);
        
        //Adición de elementos de otra colección.
        elementos.addAll(listaNombres);
        
        System.out.println("Lista de nombres: ");
        listaNombres.forEach(System.out::println);
        
        System.out.println("Lista colores: ");
        listaColores.forEach(System.out::println);
        
        System.out.println("Lista de elementos");
        elementos.forEach(System.out::println);
        
        //Iteración a través del ArrayList
        
        //Convertir en Array
        
        //Insertar elemento en una posición aleatoria.
        
    }
}
