import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private int numProductos;
    private ArrayList<String> cesta;

    public Cliente() {
        this.nombre = Utils.generadorNombres();
        this.numProductos = 1 + Utils.rand.nextInt(20); // número aleatorio de productos entre 1 y 20
        this.cesta = new ArrayList<>();
        for (int i = 0; i < this.numProductos; i++) {
            String producto = Utils.generadorProductos();
            this.cesta.add(producto);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumProductos() {
        return this.numProductos;
    }

    public ArrayList<String> getCesta() {
        return this.cesta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================\n");
        sb.append("Cliente\n");
        sb.append("* Nombre: ").append(this.nombre).append("\n");
        sb.append("* Total de productos: ").append(this.numProductos).append("\n");
        sb.append("* Lista de artículos en la cesta:\n");
        for (String producto : this.cesta) {
            sb.append(producto).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }
}


