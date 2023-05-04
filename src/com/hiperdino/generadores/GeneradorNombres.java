package com.hiperdino.generadores;
import java.util.Random;
public class GeneradorNombres {
    private static String[] nombres = {"Juan", "Ana", "Pedro", "María", "Carlos", "Laura", "Miguel", "Sofía", "José", "Lucía", "Antonio", "Paula", "Rocío", "David", "Elena", "Manuel", "Carmen", "Javier", "Isabel", "Rubén"};


    public static String generadorNombres() {
        Random rand = new Random();
        return nombres[rand.nextInt(nombres.length)];
    } 
}
