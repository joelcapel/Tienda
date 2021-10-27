package com.company;

import java.util.ArrayList;

public class Cliente {
    Carro carro = new Carro();
    float suma;
    String[] nombre = {"Joel", "Manel", "Bryan", "Adrian", "Pol", "Franklin", "Eric"};
    int numeroDeClientes = nombre.length;
    ArrayList<Producto> totalProductos;

    public void nombreAleatorio(String caja){
        for (int i = 0; i < Math.random()*numeroDeClientes; i++) {
            int n = (int) (Math.random()*nombre.length);
            listaDeLaCompra(n, caja);
        }
    }

    public void listaDeLaCompra(int n, String caja) {
        suma = 0;
        try {
            totalProductos = carro.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Producto producto: totalProductos) {
            suma += producto.precioProducto;
        }
        String sumaConDecimales = String.format("%.2f",suma);
        System.out.println( "___________________________________________________________" + "\n" +
                Toolbox.ANSI_GREEN + caja + Toolbox.ANSI_RESET +  "  -->  " + Toolbox.ANSI_YELLOW + "Cliente: " + nombre[n] + Toolbox.ANSI_RESET + "  -->  " + "Total a pagar: " + sumaConDecimales + "€" + "\n" +
                "___________________________________________________________" + "\n");
    }
}