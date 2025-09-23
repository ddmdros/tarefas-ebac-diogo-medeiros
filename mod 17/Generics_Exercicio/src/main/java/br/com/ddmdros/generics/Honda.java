package br.com.ddmdros.generics;

public class Honda extends Carro {

    public Honda(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + "da Honda acelerando!");
    }

    @Override
    public String toString() {
        return getModelo() + " da Honda";
    }
}
