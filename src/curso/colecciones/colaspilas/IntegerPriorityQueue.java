/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.colecciones.colaspilas;

import java.util.PriorityQueue;

/**
 *
 * @author jvazquezolivares
 */
public class IntegerPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        //Añadir items a nuestra cola de prioridad utilizando el método add()
        queue.add(10);
        queue.add(20);
        queue.add(15);
        
        System.out.println("El elemento a la cabeza de la cola es: " + queue.peek());
        
        queue.poll();
        
        queue.forEach(System.out::println);
        
        System.out.println("\nImprimir nuevamente la cabeza de la cola después de haber eliminado el 10");
        // Imprimir nuevamente la cabeza de la cola después de haber utilizado poll()
        System.out.println(queue.peek());
    }
}
