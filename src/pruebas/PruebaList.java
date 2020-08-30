package pruebas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class PruebaList {
    
    public static void main(String[] args) {
         List<Persona> listaarray = new ArrayList<>();             
         List<Persona> listalinked = new LinkedList<>();            
         long antes;  
         
         /*
            Tiempo invertido en insertar una persona en listaarray (en nanosegundos):
            672648
            Tiempo invertido en insertar una persona en listalinked (en nanosegundos):
            11693
         */
         
         for(int i=0;i<1000000;i++)             
         {                 
             listaarray.add(new Persona(i,"Persona"+i,i));
             listalinked.add(new Persona(i,"Persona"+i,i));
         }   
         
         System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");             
         antes = System.nanoTime();             
         listaarray.add(1, new Persona(10001,"Persona",1001)); // Inserción en posicion 0 de una persona  
         System.out.println(System.nanoTime()- antes);  
         
         
         System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");             
         antes = System.nanoTime();              
         listalinked.add(1, new Persona(10001,"Persona",1001));  // Inserción en posicion 0 de una persona            
         System.out.println(System.nanoTime()- antes);
    }
    
    static class Persona {
        int idPersona;
        String nombre;
        int altura;
        
        public Persona(int idPersona, String nombre, int altura){
            this.idPersona = idPersona;
            this.nombre = nombre;
            this.altura = altura;
        }
    }
    
}
