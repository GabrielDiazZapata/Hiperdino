package ejecutable;
import java.util.Scanner;
import roles.Cliente;
import roles.Cajero;
import roles.Cesta;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cajero cajero = new Cajero(1); // Creamos un cajero con número 1
        boolean cajaAbierta = false; 

        while (true) {
            // Mostramos el menú de opciones
            System.out.println("===== MENÚ CAJERO " + cajero.getNumeroCaja() + " =====");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            System.out.print("Elija una opción (1-5): ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (!cajaAbierta) {
                        cajero.abrirCaja();
                        cajaAbierta = true;
                        System.out.println("Caja abierta correctamente");
                    } else {
                        System.out.println("La caja ya estaba abierta");
                    }
                    break;

                case 2:
                if (cajaAbierta) {
                    Cliente nuevoCliente = new Cliente();
                    cajero.agregarCliente(nuevoCliente);
                    System.out.println("Se ha añadido el siguiente cliente a la cola:");
                    System.out.println(nuevoCliente.toString());
                } else {
                    System.out.println("La caja está cerrada. No se puede añadir clientes");
                }
                break;

                case 3:
                    if (cajaAbierta) {
                        Cliente clienteAtendido = cajero.atenderCliente();
                        if (clienteAtendido != null) {
                            System.out.println("Se ha atendido al siguiente cliente:");
                            System.out.println(clienteAtendido.toString());
                        } else {
                            System.out.println("No hay clientes a los que atender");
                        }
                    } else {
                        System.out.println("La caja está cerrada. No se pueden atender clientes");
                    }
                    break;

                case 4:
                    if (cajaAbierta) {
                        System.out.println("Clientes pendientes:");
                        for (Cliente cliente : cajero.getFilaClientes()) {
                            System.out.println(cliente.toString());
                        }
                    } else {
                        System.out.println("La caja está cerrada. No hay clientes pendientes");
                    }
                    break;

                case 5:
                    if (cajaAbierta) {
                        cajero.cerrarCaja();
                        cajaAbierta = false;
                    }
                    System.out.println("¡Hasta pronto!");
                    return;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo");
                    break;
            }
        }
    }
}
