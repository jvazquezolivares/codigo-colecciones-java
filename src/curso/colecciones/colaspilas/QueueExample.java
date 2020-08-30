package curso.colecciones.colaspilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author jvazquezolivares
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        // Añade los elmentos {0, 1, 2, 3, 4} a la queue
        for (int i = 0; i < 5; i++) {
           queue.add(i);
           //queue.offer(i);
        }
        
        // Muestra el contenido de la queue
        System.out.print("Elementos de la cola: " + queue);
        System.out.println("");
        
        // Elimina el head de la queue
        int head = queue.remove();
        //int head = queue.poll();
        System.out.print("El head de esta cola es: " + head);
        System.out.println("");
        
        System.out.print("Elementos de la cola después del método remove/poll: " + queue);
        System.out.println(""); 
        
        int size = queue.size();
        
        System.out.println("El tamaño de la cola es: " + size);
        
        System.out.println("La cabeza de la cola ahora es: " + queue.peek());
        
        System.out.print("Elementos de la cola: " + queue);
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
           stack.add(i);
           //queue.offer(i);
        }
        
        // Muestra el contenido de la queue
        System.out.print("Elementos de la pila: " + stack);
        System.out.println("");
        
        // Elimina el head de la queue
        int head2 = stack.pop();
        //int head = queue.poll();
        System.out.print("El head de esta pila es: " + head2);
        System.out.println("");
        
        System.out.print("Elementos de la pila después del método remove/poll: " + stack);
        System.out.println(""); 
        
        int size2 = stack.size();
        
        System.out.println("El tamaño de la cola es: " + size2);
        
        System.out.println("La cabeza de la cola ahora es: " + stack.peek());
        
        System.out.print("Elementos de la cola: " + stack);
        System.out.println("");
    }
}
