package com.company;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Carro implements Callable<ArrayList<Producto>> {
    Tienda tienda = new Tienda();
    ArrayList<Producto> productos;

    @Override
    public ArrayList<Producto> call() throws Exception {
        productos = new ArrayList<>();
        for (int i = 0; i < Math.random()*20; i++) {
            int n = (int) (Math.random()*tienda.nombreProducto.length);
            productos.add(new Producto(tienda.nombreProducto[n], tienda.precioProducto[n]));
        }
        return productos;
    }
}