package br.com.ddmdros.generics;

public class Citroen extends Carro{

    public Citroen(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " da Citroen acelerando!");

    }

    @Override
    public String toString() {
        return getModelo() + " da Citroen";
    }
}
