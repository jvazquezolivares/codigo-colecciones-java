package curso.colecciones.mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author jvazquezolivares
 */
public class MapCommonMethods {
    
    public static void main(String[] args) {
        //Ejemplo de un mapa que almacena un nombre de jugador
        //En relación con su equipo. Tanto el nombre del jugador como el nombre del equipo, serán String
        Map<String, String> players = new HashMap<>();
        
        //Inserción de elementos en el mapa
        players.put("Leo Messi", "Barcelona");
        players.put("Luis Suarez", "Barcelona");
        players.put("Arturo Vidal", "Barcelona");
        players.put("Rakitik", "Barcelona");
        players.put("Sergio Ramos", "Real Madrid");
        players.put("Toni Kroos", "Real Madrid");
        players.put("Luka Modric", "Real Madrid");
        players.put("Ansu Fati", null);
        
        //Utilizando el constructor de la clase
        //Map<String, String> players2 = new HashMap<>(players);
        
        //Utilizando el método putAll(Map<? extends K, ? extends v> m)
//        Map<String, String> players3 = new HashMap<>();
//        players3.putAll(players);
        
        //Añadir si hay un valor ausente
        players.putIfAbsent("Ansu Fati", "Barcelona");
        System.out.println("El equipo de Ansu Fati es: " + players.get("Ansu Fati"));
        
        //Si ahora intento cambiarlo de nuevo, ya no lo permite.
        players.putIfAbsent("Ansu Fati", "Sevilla");
        System.out.println("¿En qué equipo está ahora Ansu Fati?:: " + players.get("Ansu Fati"));
        
        //Obtener los valores de un mapa
        String equipoleo = players.get("Leo Messi");
        System.out.println("El equipo de Leo es: " + equipoleo);
        
        String equipoCristiano = players.getOrDefault("Cristiano Ronaldo", "No está registrado");
        System.out.println("El equipo de Cristiano Ronaldo es: " + equipoCristiano);
       
        
        //Preguntar si una clave está incluida en el mapa
        if (players.containsKey("Luka Modric")) {
            System.out.println("El equipo de Luka Modric es: " + players.get("Luka Modric"));
        }
        else {
            System.out.println("No se encuentra Luka Modric");
        }
        
        
        //También es posible preguntar si existe un valor en el mapa
        System.out.println("Se encuentra un jugador del Sevilla? " + players.containsValue("Sevilla"));
        
        
        //Obtener todas las claves (keys) del mapa
        System.out.println("¿Qué jugadores están registrados?");
        System.out.println(players.keySet());
        
        
        //Obtener todos los valores del mapa
        System.out.println("¿Qué equipos están registrados en relación a los jugadores?");
        System.out.println(players.values());
        
        //Reemplazar uno de los valores en el mapa.
        players.replace("Rakitik", "Sevilla");
        System.out.println("Ahora Rakitik juega en: " + players.get("Rakitik"));
        
        //Eliminar una entrada del mapa.
        System.out.println("Se encuentra Rakitik en el registro? " + players.containsKey("Rakitik"));
        players.remove("Rakitik");
        System.out.println("Se encuentra Rakitik en el registro? " + players.containsKey("Rakitik"));
        
        //También podemos conocer el tamaño del mapa (el número de entradas en el mapa).
        System.out.println("El tamaño del mapa es: " + players.size());
        
        
        //Preguntar si el mapa está vacío
        if (players.isEmpty()) {
            System.out.println("El registro de jugadores está vacío");
        }
        else {
            System.out.println("El registro de jugadores no está vacío");
        }
        
        for (String player : players.keySet()) {
            System.out.println("Jugador: "  + player);
        }
        
        for (String equipo : players.values()) {
            System.out.println("Equipos: " + equipo);
        }
       
        for (Iterator<Map.Entry<String, String>> iter = players.entrySet().iterator(); iter.hasNext();) {
            Map.Entry<String, String> entry = iter.next();
            String player = entry.getKey();
            String team = entry.getValue();
            System.out.println("Jugador: " + player + " Equipo: " + team);
        }
        //Limpiar todo el mapa.
        //players.clear();
        System.out.println("La cantidad de jugadores en el mapa después de limpiarlo es: " + players.size());
        
    }
}
