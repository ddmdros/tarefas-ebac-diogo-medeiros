package br.com.ddmdros.generics;

public class Fiat extends Carro{

    public Fiat(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + "da Fiat acelerando!");
    }

    @Override
    public String toString() {
        return getModelo() + " da Fiat";
    }
}
