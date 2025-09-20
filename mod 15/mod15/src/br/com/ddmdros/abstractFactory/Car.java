package br.com.ddmdros.abstractFactory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.color = color;
        this.fuelSource = fuelSource;
    }

    public void startEngine(){
        System.out.println("The " + fuelSource + " engine has been started, and is ready to use its " + horsePower + " horsepower");

    }

    public void clean(){
        System.out.println("Car has been cleaned, and the " + color.toLowerCase() + " color shines");
    }

    public void mecanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything looks good");
    }

    public void fuelCar(){
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }

}
