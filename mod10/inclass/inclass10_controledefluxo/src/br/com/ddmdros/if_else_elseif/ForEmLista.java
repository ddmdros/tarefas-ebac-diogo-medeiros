package br.com.ddmdros.if_else_elseif;

import java.util.ArrayList;
import java.util.List;

public class ForEmLista {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>(10);

        // for normal
        // sei previamente a quantidade de registros
        for(int i = 0; i <= 10; i++){
            System.out.println("Linha" + i);
            valores.add(i);
        }

        //for em lista
        // nao sei a quantidade de registros que tem aqui dentro
        for (Integer i : valores){
            System.out.println("Linha" + i);
        }

        //for com lambda
        // vamos ver mais pra frente
        valores.forEach(i -> System.out.println("Linha" + i));
    }
}
