package generadores;
import java.util.Random;
public class GeneradorNombres {
    public static final Random rand = new Random();
    


    public static String generadorNombres() {
        String[] nombres = {"Juan", "Ana", "Pedro", "María", "Carlos", "Laura", "Miguel", "Sofía", "José", "Lucía", "Antonio", "Paula", "Rocío", "David", "Elena", "Manuel", "Carmen", "Javier", "Isabel", "Rubén"};
        return nombres[rand.nextInt(nombres.length)];
    } 
}
