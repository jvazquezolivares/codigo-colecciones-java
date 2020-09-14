/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.colecciones.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class MethodBinarySearch {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(8);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);
        numeros.add(11);
        
        numeros.indexOf(1);
        
        Collections.sort(numeros);
        
        System.out.println("\n");
        System.out.println(numeros);
        
        int indice = Collections.binarySearch(numeros, 1);
        
        System.out.println("Él índice del número 1 es: " + indice);
    }
}
