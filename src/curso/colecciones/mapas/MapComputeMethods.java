package curso.colecciones.mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jvazquezolivares
 */
public class MapComputeMethods {
    public static void main(String[] args) {
        Map<String, Integer> salaryEmployee = new HashMap<>();
        
        salaryEmployee.put("Maria", 25);
        
        salaryEmployee.compute("Maria", (k, v) -> v * 2 );
        
        System.out.println(salaryEmployee);
    }
}
