package curso.colecciones.conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author jvazquezolivares
 */
public class SetExamples {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Arbol");
        hashSet.add("Remora");
        hashSet.add("Casa");
        hashSet.add("Casa");
        hashSet.add("Ratón");
        hashSet.add("Armadillo");
        hashSet.add("Sobre");
        hashSet.add("Remora");
        hashSet.add("Iguana");
        hashSet.add("Casa");
        hashSet.add("Sofá");
        System.out.println("hashSet: " + hashSet);
        
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Arbol");
        linkedHashSet.add("Remora");
        linkedHashSet.add("Casa");
        linkedHashSet.add("Casa");
        linkedHashSet.add("Ratón");
        linkedHashSet.add("Armadillo");
        linkedHashSet.add("Sobre");
        linkedHashSet.add("Remora");
        linkedHashSet.add("Iguana");
        linkedHashSet.add("Casa");
        linkedHashSet.add("Sofá");
        System.out.println("linkedHashSet: " + linkedHashSet);
    }
}
