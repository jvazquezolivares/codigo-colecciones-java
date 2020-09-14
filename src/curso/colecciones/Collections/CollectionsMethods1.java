package curso.colecciones.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Muestra el uso de los métodos addAll, frequency y disjoint de la clase Collections
 * @author jvazquezolivares
 */
public class CollectionsMethods1 {
    public static void main(String[] args) {
        //Inicializa lista1 y lista2
        String[] colores = {"rojo", "blanco", "amarillo", "azul"};
        List<String> list1 = Arrays.asList(colores);
        List<String> list2 = new ArrayList<>();

        list2.add("negro");
        list2.add("rojo");
        list2.add("verde");
        
        System.out.println("Antes de addAll, list2 contiene: ");
        
        for (String s : list2) {
            System.out.println(" " + s);
        }
        
        Collections.addAll(list2, colores); //Agrega los objetos String de colores a list1
        
        System.out.println("\nDespués de addAll, list2 contiene: ");
        
        for (String s : list2) {
            System.out.println(" " + s);
        }
        
        //Obtiene la frecuencia de rojo
        int frecuencia = Collections.frequency(list2, "rojo");
        System.out.println("\nFrecuencia del color rojo en la lista list2: " + frecuencia);
        
        
        //Comprueba si list1 y list2 tienen elementos en común.
        boolean desunion = Collections.disjoint(list1, list2);
        
        System.out.printf("%nlist1 y list2 %s elementos en común%n", desunion ? "no tienen" : "tienen");
    }
}
