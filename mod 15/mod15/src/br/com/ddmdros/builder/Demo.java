package br.com.ddmdros.builder;

public class Demo {
    public static void main(String[] args) {
       // Gerente gerente = new Gerente(new CheeseBurgerBuilder() {});

        Gerente gerente = new Gerente();

        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burguer = gerente.buildBurger();
        burguer.print();

        gerente.setBuilder(new VeganBurgerBuilder());
        Burger burger1 = gerente.buildBurger();
        burger1.print();

//        Gerente gerente1 = new Gerente(new VeganBurgerBuilder());
    }
}
