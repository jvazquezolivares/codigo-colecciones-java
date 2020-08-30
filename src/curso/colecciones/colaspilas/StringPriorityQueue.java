/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.colecciones.colaspilas;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author jvazquezolivares
 */
public class StringPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        
        //añadimos items a nuestra cola de prioridad
        queue.add("C");
        queue.add("C++");
        queue.add("Java");
        queue.add("Python");
        
        //Mostramos (sin eliminar) el elemento de mayor prioridad
        System.out.println("El valor del head de este PriorityQueue es: " + queue.peek());
        
        //Removemos el elemento top de la cola de prioridad (o head) y
        //Realizamos la impresión de la cola de prioridad modificada.
        String elementoDesencolado = queue.poll();
        System.out.println("Después de remover el elemento de mayor prioridad, la cola queda de la siguiente manera: ");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
        queue.remove("Java");
        System.out.println("Después de remover Java nuestra cola de prioridad queda de la siguiente manera: ");
        Iterator<String> itr3 = queue.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        
        // Checar si un elemento está presente en nuestra cola de prioridad utilizando contains()
        boolean b = queue.contains("C");
        System.out.println("La cola de prioridad contiene el elemento C? : " + b );
        
        //Obteniendo los elementos de la cola en un array simple utilizando toArray()
        Object [] arr = queue.toArray();
        System.out.println("Valores del array: ");
        for (Object object : arr) {
            System.out.println(object);
        }
    }
}
