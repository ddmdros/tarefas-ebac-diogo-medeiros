package br.com.ddmdros.exercicio;
import java.lang.annotation.Annotation;


public class Main {
    public static void main(String[] args) {
        Class<Carro> carro = Carro.class;

        if (carro.isAnnotationPresent(ITabela.class)){
            ITabela tabela = carro.getAnnotation(ITabela.class);
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A classe não possui a annotation @Tabela");
        }

    }
}