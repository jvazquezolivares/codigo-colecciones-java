package curso.colecciones.listas.listaEnlazada;

/**
 *
 * @author jvazquezolivares
 */
public class SimpleLinkedList {
    private Node first; //referencia al primer nodo de la lista enlazada.
    
    public SimpleLinkedList(){
        this.first = null;
    }
    
    public void push(Object obj){
        //Este nuevo nodo será la cabeza de la lista enlazada simple.
        Node newNode = new Node(obj);
        //Ahora el nuevo nodo creado es el primero (apunta primero a first y luego newNode es el nuevo first).
        newNode.setNext(this.first);
        this.first = newNode;
    }
    
    public Node pop(){
        Node temp = this.first; //Guarda referencia al primer nodo en la variable temp.
        this.first = this.first.next();
        
        return temp;
    }
    
    public Node delete(Object val) {
        Node currentNode = this.first;
        Node previousNode = this.first;
        
        while(!currentNode.value().equals(val)){
            if(currentNode.next() == null) {
                return null;
            }else {
                previousNode = currentNode;
                currentNode = currentNode.next();
            }
        }
        
        if(currentNode == this.first) {
            this.first = this.first.next();
        } else {
            previousNode.setNext(currentNode.next());
        }
        
        return currentNode;
    }
    
    public boolean isEmpty(){
        return( this.first == null );
    }
    
    public Node contains(Object val) {
        Node currentNode = this.first;
        
        while(!currentNode.value().equals(val)){
            if(currentNode.next() == null) {
                return null;
            }
            else {
                currentNode = currentNode.next();
            }
        }
        
        return currentNode;
    }
    
    public Node insert(Object value, Object newValue){
        Node newNode = new Node(newValue);
        Node currentNode = this.first;
        
        while(!currentNode.value().equals(value)){
            if(currentNode.next() == null) {
                return null;
            }
            else {
                currentNode = currentNode.next();
            }
        }
        
        newNode.setNext(currentNode.next());
        currentNode.setNext(newNode);
        
        return newNode;
    }
    
    public void printContent(){
        Node currentNode = first;
        
        System.out.println("Mostrar elementos de la lista enlazada: ");
        while(currentNode != null) {
            currentNode.showContent();
            currentNode = currentNode.next();
        }
    }
    
    
}
