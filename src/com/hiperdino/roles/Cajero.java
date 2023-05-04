package com.hiperdino.roles;
import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private int numeroCaja;
    private Queue<Cliente> filaClientes;

    public Cajero(int numeroCaja) {
        this.numeroCaja = numeroCaja;
        filaClientes = new LinkedList<>();
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public void agregarCliente(Cliente cliente) {
        filaClientes.add(cliente);
    }

    public Cliente atenderCliente() {
        return filaClientes.poll();
    }

    public boolean hayClientesEnFila() {
        return !filaClientes.isEmpty();
    }

    public void mostrarFilaClientes() {
        System.out.println("Clientes en la fila del cajero " + numeroCaja + ":");
        for (Cliente cliente : filaClientes) {
            System.out.println(cliente);
        }
    }
}
