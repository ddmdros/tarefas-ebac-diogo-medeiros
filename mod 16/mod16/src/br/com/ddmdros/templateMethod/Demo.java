package br.com.ddmdros.templateMethod;

public class Demo {
    public static void main(String[] args) {
        Trabalhador t1 = new Bombeiro();
        t1.executar();

        Trabalhador t2 = new Policial();
        t2.executar();
    }
}
