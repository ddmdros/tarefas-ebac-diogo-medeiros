package br.com.ddmdros.generics;

abstract class Carro {
    private String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public abstract void acelerar();

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
