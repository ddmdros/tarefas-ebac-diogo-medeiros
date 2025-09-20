package br.com.ddmdros.abstractFactory;

public class SemContratosFactory  extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
            if ("B".equals(requestedGrade)){
                return new BrasiliaCar(150,"diesel", "blue");
            } else{
                return new ToyotaCar(600,"gas","yellow");
            }
    }
}
