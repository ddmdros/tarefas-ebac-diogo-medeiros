package br.com.ddmdros.builder;

public class Gerente {

    BurgerBuilder builder;

//    public Gerente(BurgerBuilder builder) {
//        this.builder = builder;
//    }

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger(){
        builder.buildBun();
        builder.buildMeat();
        builder.buildCheese();
        builder.buildSalad();
        builder.buildSauce();
        return  builder.build();


    }
}
