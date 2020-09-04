package curso.colecciones.mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author jvazquezolivares
 */
public class MapsExamples {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHasMap = new LinkedHashMap<>();
        
        //Los elementos en un mapa de tipo HashMap, no respetan el orden de inserción.
        hashMap.put("uno", "Andres");
        hashMap.put("dos", "Jaime");
        hashMap.put("tres", "Felipe");
        hashMap.put("cuatro", "Sebastián");
        hashMap.put("cinco", "Eduardo");
        hashMap.put("seis", "Rodrigo");
        hashMap.put("siete", "Yadira");
        hashMap.put("ocho", "Sofia");
        hashMap.put("nueve", "Oyuki");
        hashMap.put("diez", "Concepción");
        hashMap.put("once", "Silvia");
        hashMap.put("doce", "Adriana");
        hashMap.put("trece", "Jacinto");
        hashMap.put("catorce", "Javier");
        hashMap.put("quince", "Arturo");
        hashMap.put("dieciseis", "Irma");
  
        System.out.println("hashMap: " + hashMap);
        System.out.println("");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("People " + entry.getKey()+ " " + entry.getValue());
        }
        
        //Los elementos en un mapa de tipo LinkedHashMap, mantienen el orden de inserción.
        linkedHasMap.put("uno", "Andres");
        linkedHasMap.put("dos", "Jaime");
        linkedHasMap.put("tres", "Felipe");
        linkedHasMap.put("cuatro", "Sebastián");
        linkedHasMap.put("cinco", "Eduardo");
        linkedHasMap.put("seis", "Rodrigo");
        linkedHasMap.put("siete", "Yadira");
        linkedHasMap.put("ocho", "Sofia");
        linkedHasMap.put("nueve", "Oyuki");
        linkedHasMap.put("diez", "Concepción");
        linkedHasMap.put("once", "Silvia");
        linkedHasMap.put("doce", "Adriana");
        linkedHasMap.put("trece", "Jacinto");
        linkedHasMap.put("catorce", "Javier");
        linkedHasMap.put("quince", "Arturo");
        linkedHasMap.put("dieciseis", "Irma");
        
        for (Map.Entry<String, String> entry : linkedHasMap.entrySet()) {
            System.out.println("People " + entry.getKey()+ " " + entry.getValue());
        }
    }
}
