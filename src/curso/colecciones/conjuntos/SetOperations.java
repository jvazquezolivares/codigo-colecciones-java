package curso.colecciones.conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jvazquezolivares
 */
public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> a = 
            new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        
        Set<Integer> b = 
            new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));  
        
        //Unión de conjuntos
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Unión de dos conjuntos");
        System.out.println(union);
        
        //Intersección de conjuntos
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersección de dos conjuntos");
        System.out.println(intersection);
        
        //Diferencia de conjuntos
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Diferencia entre dos conjuntos");
        System.out.println(a);
        System.out.println(b);
        System.out.println(difference);
    }
}
