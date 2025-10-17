package br.com.ddmdros.tarefa_stream;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ITabela {

    String nome();

}
