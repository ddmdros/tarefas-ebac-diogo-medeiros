package br.com.ddmdros.exercicio;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ITabela {

    String nome();

}
