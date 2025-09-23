package br.com.ddmdros.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ICarros toro = new Fiat<Fiat>();
//        ICarros basalt = new Citroen<Citroen>();

        List<Carro> carros = new ArrayList<>();
        carros.add(new Honda("Fit"));
        carros.add(new Honda("Civic"));

        carros.add(new Citroen("Dark Basalt"));
        carros.add(new Citroen("Aircross XTR"));

        carros.add(new Fiat("Toro"));
        carros.add(new Fiat("Cronos"));

        System.out.println(carros.toString());


    }
}
