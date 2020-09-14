package curso.colecciones.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class CollectionsMethods2 {
    public static void main(String[] args) {
        //Crea y muestr aun objeto List<Character>
        Character[] letras = {'P', 'C', 'M'};
        List<Character> listaLetras = Arrays.asList(letras);
        System.out.println("Lista contiene: ");
        imprimir(listaLetras);
        
        //Invierte y muestra el objeto List<Character>
        Collections.reverse(listaLetras);
        System.out.println("Después de llamar a reverse, lista contiene: ");
        imprimir(listaLetras);
        
        //Crea copiaLista a partir de un arreglo.
        Character[] letrasCopia = new Character[3];
        List<Character> copiaLista = Arrays.asList(letrasCopia);
        
        //Copia el contenido de la lista a copiaLista
        Collections.copy(copiaLista, listaLetras);
        System.out.println("Después de copiar, copiaLista contiene: ");
        imprimir(copiaLista);
        
        //Llena la lista con letras R
        Collections.fill(listaLetras, 'R');
        System.out.println("Después de llamar a fill, lista contiene: ");
        imprimir(listaLetras);
    }
    
    private static void imprimir(List<Character> refLista){
        System.out.print("La lista es: ");
        
        for (Character elemento : refLista) {
            System.out.print(elemento);
        }
        
        System.out.printf("%nMax: %s", Collections.max(refLista));
        System.out.printf("   Min %s%n", Collections.min(refLista));
        
        System.out.println("");
        
    }
}
