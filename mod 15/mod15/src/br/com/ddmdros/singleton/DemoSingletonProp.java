package br.com.ddmdros.singleton;

public class DemoSingletonProp {
    public static void main(String[] args) {
        SingletonPropriedades singleton = SingletonPropriedades.getInstance("textoTeste");
        SingletonPropriedades singleton1 = SingletonPropriedades.getInstance("textoTeste1");
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());

    }
}
