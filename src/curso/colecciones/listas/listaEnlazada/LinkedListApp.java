package curso.colecciones.listas.listaEnlazada;

/**
 *
 * @author jvazquezolivares
 */
public class LinkedListApp {
    
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(1.23);
        list.push(19.23);
        list.push(12.23);
        
        list.printContent();
        
        Node nodo = list.insert(19.23, 78.4);
        if(nodo == null) {
            System.out.println("no se pudo insertar un nuevo nodo");
        }
        else {
            System.out.println("El nodo se ha insertado correctamente");
        }
        
        System.out.println("El nuevo contenido de la lista enlazada es: ");
        list.printContent();
        
        nodo = list.contains(1.23);
        
        if(nodo == null) {
            System.out.println("El nodo no se ha encontrado");
        }
        else {
            System.out.println("El valor 1.23 se ha encontrado en la lista");
        }
        
        System.out.println("Eliminación de nodos: ");
        while(!list.isEmpty()) {
            
            nodo = list.pop();
            System.out.println("Nodo eliminado");
            nodo.showContent();
        }
        
        list.printContent();
        
        list.push("Cat");
        list.push("Dog");
        
        list.printContent();
        
        list.delete("Cat");
        
        System.out.println("Lista despues de eliminado Cat");
        
        list.printContent();
        
        
    }
    
}
