package br.com.ddmdros.observer;

public class Demo {
    public static void main(String[] args) {

        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notify("Teste");

    }
}
