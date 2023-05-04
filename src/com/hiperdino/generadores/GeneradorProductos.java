package generadores;
import java.util.Random;
public class GeneradorProductos {
    public static final Random rand = new Random();
    
    public static String generadorProductos(){
        String[] productos = {"Leche", "Huevos", "Pan", "Azúcar", "Sal", "Aceite", "Café", "Té", "Arroz", "Pasta", "Carne", "Pescado"};
        return productos[rand.nextInt(productos.length)];
    }
}
