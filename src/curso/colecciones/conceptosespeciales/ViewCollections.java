package curso.colecciones.conceptosespeciales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class ViewCollections {
    public static void main(String[] args) {
        String [] nombres = {"Juan", "Manuel", "Sandra"};
        
        List<String> nombresList = Arrays.asList(nombres);
        for (String nombre : nombresList) {
            System.out.println(nombre);
        }
        
        nombres[1] = "Yadhira";
        
        //nombresList.add("Josue");
        
        System.out.println("\nNombres después de la modificación: ");
        for (String nombre : nombresList) {
            System.out.println(nombre);
        }
        
        List<String> nombresList2 = new ArrayList<>(Arrays.asList(nombres));
        
        System.out.println("\nNombres de la lista de nombres 2");
        for (String nombre : nombresList2) {
            System.out.println(nombre);
        }
        
        System.out.println("\nNombres de la sublista: ");
        
        List<String> sublista = nombresList2.subList(0, 1);
        for (String string : sublista) {
            System.out.println(string);
        }
        
        sublista.add("María");
        
        System.out.println("\nNombres de la sublista: ");
        for (String string : sublista) {
            System.out.println(string);
        }
        
        nombresList2.set(0, "Josué");
         
        System.out.println("\nNombres de la sublista: ");
        for (String string : sublista) {
            System.out.println(string);
        }
        
        System.out.println("\nLista original después de todo esto: ");
        for (String nombre : nombresList2) {
            System.out.println(nombre);
        }
        
    }
}
