package com.hiperdino.generadores;
import java.util.Random;
public class GeneradorProductos {
    private static String[] productos = {"Leche", "Huevos", "Pan", "Azúcar", "Sal", "Aceite", "Café", "Té", "Arroz", "Pasta", "Carne", "Pescado"};
    
    public static String generadorProductos(){
        Random rand = new Random();
        return productos[rand.nextInt(productos.length)];
    }
}
