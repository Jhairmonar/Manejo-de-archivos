import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class SistemaProductos {
    public static void main(String[] args) {
        File archivo = new File("ArchivoProductos.txt");
        
        if (!archivo.exists()) {
            System.out.println("Error: el archivo productos.txt no existe.");
            return;
        }
        
        double totalGlobal = 0;
        double mayorSubtotal = 0;
        String productoMayor = "";
        
        try {
            Scanner lector = new Scanner(archivo);
            lector.useLocale(Locale.US); 
            
            System.out.println("--- Detalles por Producto ---");
            
            while (lector.hasNext()) {
                String nombre = lector.next();
                double precio = lector.nextDouble();
                int cantidad = lector.nextInt();
                
                double subtotal = precio * cantidad;
                totalGlobal += subtotal;
                
                System.out.println("Producto: " + nombre + " | Subtotal: $" + subtotal);
                     
                if (subtotal > mayorSubtotal) {
                    mayorSubtotal = subtotal;
                    productoMayor = nombre;
                }
            }
            
            lector.close();
            
            System.out.println("-----------------------------");
            System.out.println("Total a pagar: $" + totalGlobal);
            System.out.println("Producto mayor: " + productoMayor + " (Subtotal de $" + mayorSubtotal + ")");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}