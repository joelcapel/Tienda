package com.company;

public class Caja implements Runnable{
    Cliente cliente = new Cliente();
    String nombre;

    public Caja(String caja) {
        this.nombre =  caja;
    }

    @Override
    public void run() {
        cliente.nombreAleatorio(nombre);
    }
}