package curso.colecciones.listas.inventarios;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class Inventory {
    
    private List<Product> products;
    
    public Inventory(){
        products = new LinkedList<>();
    }
    
    public void newProduct(int ID, String name, int existence, double price){
        Product newProduct = new Product(ID, name, existence, price);
        
        boolean success = products.add(newProduct);
        
        if(success){
            System.out.println("El producto " +name+ "se añadió correctamente al inventario");
        } else {
            System.out.println("Ocurrió un problema al agregar el producto "+name+ " al inventario");
        }
    }
    
    public void addProduct(int ID){
        int productIndex = products.indexOf(new Product(ID));
        
        Product product = products.get(productIndex);
        int existenceTemp = product.getExistence();
        int newExistence = existenceTemp += 1;
        product.setExistence(newExistence);
        System.out.println("\n Se ha agregado un producto "+product.getName()+ " exitosamente\n");
    }
    
    public void printProducts(){
        System.out.println("Relación de productos en el almacén: ");
        products.forEach(System.out::println);
        System.out.println("\n\n");
    }

    public void updateProductPrice(int ID, double price) {
        int productIndex = products.indexOf(new Product(ID));
        
        Product product = products.get(productIndex);
        product.setPrice(price);
        System.out.println("\nSe ha actualizado el precio correctamente\n");
    }

    public void deleteProduct(int ID) {
        int productIndex = products.indexOf(new Product(ID));
        Product deleteProduct = products.remove(productIndex);
        
        if(deleteProduct != null) {
            System.out.println("El product "+deleteProduct+" se ha eliminado");
        } else {
            System.out.println("No fue posible eliminar el producto con ID: "+ ID);
        }
    }
   
}
