package br.com.ddmdros.templateMethod;

public class Policial extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como policial");
    }
}
