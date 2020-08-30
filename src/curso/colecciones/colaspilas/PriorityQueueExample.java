package curso.colecciones.colaspilas;

import java.util.PriorityQueue;

/**
 *
 * @author jvazquezolivares
 */
public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //[6, 9, 8, 1, 5, 6, 0, 11, 10, 4]
        
        queue.add(6);
        queue.add(9);
        queue.add(8);
        queue.add(1);
        queue.add(5);
        queue.add(6);
        queue.add(0);
        queue.add(11);
        queue.add(10);
  
        
        System.out.println(queue);
        
        queue.poll();
        
        System.out.println(queue);

    }
    
}
