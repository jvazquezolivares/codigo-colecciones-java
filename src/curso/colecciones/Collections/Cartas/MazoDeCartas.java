package curso.colecciones.Collections.Cartas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class MazoDeCartas {
    List<Carta> listaCartas; //Declara objeto List que almacenará los objetos Carta
    
    public MazoDeCartas(){
        Carta[] mazo = new Carta[52]; //un mazo tiene 52 cartas
        
        int cuenta = 0; //número de cartas
        
        //llena el mazo con objetos Carta
        for (Carta.Palo palo : Carta.Palo.values()) {
            for (Carta.Cara cara : Carta.Cara.values()) {
                mazo[cuenta] = new Carta(cara, palo);
                ++cuenta;
            }
        }
        
        listaCartas = Arrays.asList(mazo);
        Collections.shuffle(listaCartas);
    }
    
    public void imprimirCartas(){
        for (int i = 0; i < listaCartas.size(); i++) {
            System.out.printf("%-23s%s", listaCartas.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    
    }
    
    public static void main(String[] args) {
        MazoDeCartas cartas = new MazoDeCartas();
        cartas.imprimirCartas();
                
    }
}
