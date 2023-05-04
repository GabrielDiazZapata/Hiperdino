package roles;
import java.util.ArrayList;

public class Cesta {
    private ArrayList<String> listaProductos;
    private int totalProductos;

    public Cesta() {
        listaProductos = new ArrayList<String>();
        totalProductos = 0;
    }

    public void agregarProducto(String producto) {
        listaProductos.add(producto);
        totalProductos++;
    }

    public ArrayList<String> getListaProductos() {
        return listaProductos;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cesta\n");
        sb.append("* Total de productos: ").append(totalProductos).append("\n");
        sb.append("* Lista de artículos en la cesta:\n");
        for (String producto : listaProductos) {
            sb.append(producto).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }
}
