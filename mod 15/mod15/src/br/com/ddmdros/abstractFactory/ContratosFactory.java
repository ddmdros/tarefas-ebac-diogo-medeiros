package br.com.ddmdros.abstractFactory;

public class ContratosFactory extends  Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)){
            return new CorollaCar(100,"gas", "azul");
        } else{
            return new ToyotaCar(600,"diesel","yellow");
        }
    }
}
