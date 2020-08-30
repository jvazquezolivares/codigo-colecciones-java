/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.colecciones.colaspilas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author jvazquezolivares
 */
public class DecksExample {
    public static void main(String[] args) {

        Deque<String> numbers = new ArrayDeque<>();
        Stack<String> numbers2 = new Stack<>();
        
        numbers.offer("1");
        numbers.offer("2");
        numbers.offer("3");
        numbers.offer("4");
        numbers.offer("5");
        numbers.offer("6");
        numbers.offer("7");
        numbers.offer("8");
        numbers.offer("9");
        
        numbers2.push("1");
        numbers2.push("2");
        numbers2.push("3");
        numbers2.push("4");
        numbers2.push("5");
        numbers2.push("6");
        numbers2.push("7");
        numbers2.push("8");
        numbers2.push("9");

        System.out.println("Deque: " +numbers);
        System.out.println("Stack: " +numbers2);
                   
        System.out.println("head: " + numbers.poll());
//        
//        System.out.println("tail: " + numbers.peekLast());
//        
//        System.out.println("head-> " + numbers + " <-tail");
//        
//        System.out.println("Sacar elemento del head de la pila: " + numbers.pop());
//        
//        System.out.println("head-> " + numbers + " <-tail");
       
 
        
        
        
        
        
        
    
//       
//        
//        System.out.println("Añado Patricia a LinkedList:");             
//        antes = System.nanoTime();
//        names.addLast("Patricia");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Añado Patricia a ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.addLast("Patricia");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando addFirst en LinkedList:");             
//        antes = System.nanoTime();
//        names.addFirst("addFirst");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando addFirst en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.addFirst("addFirst");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando contains en LinkedList:");             
//        antes = System.nanoTime();
//        names.contains("Hola8");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando contains en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.contains("Hola8");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando contains en LinkedList:");             
//        antes = System.nanoTime();
//        names.contains("Hola8");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando contains en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.contains("Hola8");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando element en LinkedList:");             
//        antes = System.nanoTime();
//        names.element();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando element en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.element();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando getFirst en LinkedList:");             
//        antes = System.nanoTime();
//        names.getFirst();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando getFirst en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.getFirst();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando getLast en LinkedList:");             
//        antes = System.nanoTime();
//        names.getLast();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando getLast en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.getLast();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando forEach en LinkedList:");             
//        antes = System.nanoTime();
//        names.forEach(e -> System.out.print(""));
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando forEach en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.forEach(e -> System.out.print(""));
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando Offer en LinkedList:");             
//        antes = System.nanoTime();
//        names.offer("Offer");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando forEach en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.offer("Offer");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando offerFirst en LinkedList:");             
//        antes = System.nanoTime();
//        names.offerFirst("offerFirst");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando offerFirst en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.offerFirst("offerFirst");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando offerLast en LinkedList:");             
//        antes = System.nanoTime();
//        names.offerLast("offerLast");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando offerLast en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.offerLast("offerLast");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando poll en LinkedList:");             
//        antes = System.nanoTime();
//        names.poll();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando poll en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.poll();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando pollFirst en LinkedList:");             
//        antes = System.nanoTime();
//        names.pollFirst();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando pollFirst en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.pollFirst();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando pollLast en LinkedList:");             
//        antes = System.nanoTime();
//        names.pollLast();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando pollLast en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.pollLast();
//        System.out.println(System.nanoTime()- antes);
//        
//        
//        System.out.println("Probando peek en LinkedList:");             
//        antes = System.nanoTime();
//        names.peek();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando peek en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.peek();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando peekFirst en LinkedList:");             
//        antes = System.nanoTime();
//        names.peekFirst();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando peekFirst en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.peekFirst();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando peekLast en LinkedList:");             
//        antes = System.nanoTime();
//        names.peekLast();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando peekLast en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.peekLast();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando pop en LinkedList:");             
//        antes = System.nanoTime();
//        names.pop();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando pop en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.pop();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando push en LinkedList:");             
//        antes = System.nanoTime();
//        names.push("push");
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando push en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.push("push");
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("Probando remove en LinkedList:");             
//        antes = System.nanoTime();
//        names.remove();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando remove en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.remove();
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("\nProbando removeIf en LinkedList:");             
//        antes = System.nanoTime();
//        names.removeIf(t -> t.equals("Hello"));
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando removeIf en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.removeIf(t -> t.equals("Hello"));
//        System.out.println(System.nanoTime()- antes);
//        
//        System.out.println("\nProbando size en LinkedList:");             
//        antes = System.nanoTime();
//        names.size();
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando size en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.size();
//        System.out.println(System.nanoTime()- antes);        
//        
//        Collection<String> col1 = new ArrayList<>();
//        col1.add("Ramon");
//        Collection<String> col2 = new ArrayList<>();
//        
//        System.out.println("\nProbando removeAll en LinkedList:");             
//        antes = System.nanoTime();
//        names.removeAll(names);
//        System.out.println(System.nanoTime()- antes);  
//        
//        System.out.println("Probando removeAll en ArrayDeque:");             
//        antes = System.nanoTime();
//        names2.removeAll(names2);
//        System.out.println(System.nanoTime()- antes);        
        
    }
}
