package com.company;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Caja> cajas = new ArrayList<>();
        for (int i = 1; i < Math.random()*4+1; i++) {
            cajas.add(new Caja("Caja" + i));
        }

        for (Caja caja : cajas) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> {
                caja.run();
                executor.shutdown();
            });
        }
    }
}
