package curso.colecciones.colaspilas;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author jvazquezolivares
 */
public class BufferActions {
    Deque<String> bufferActions = new ArrayDeque<>();
    Deque<String> redoActions = new ArrayDeque<>();
    
    public void doAction(String action){
        System.out.println(action);
        inserActionsInBuffer(action);
        System.out.println(bufferActions);
    }
    
    public void undo(){
       if(bufferActions.isEmpty())
           return;
        System.out.println("Undo");
        String action = bufferActions.pollLast();
        redoActions.push(action);
        System.out.println(bufferActions);
    }
    
    public void redo(){
        System.out.println("redo");
        String action = redoActions.pop();
        inserActionsInBuffer(action);
        System.out.println("Redo actions: " + redoActions);
        System.out.println(bufferActions);
    }
    
    private void inserActionsInBuffer(String action){
        bufferActions.offerLast(action);
    }
    
    public static void main(String[] args) {
        BufferActions buffer = new BufferActions();
        buffer.doAction("Copiar");
        buffer.doAction("Pegar");
        buffer.doAction("Escribir Hola");
        buffer.doAction("Borrar");
        buffer.undo();
        buffer.undo();
        buffer.redo();
    }
}
