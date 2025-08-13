package br.com.ddmdros.lists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExemplo {

    //Ao contrário das ArrayLists, as buscas são lentas,
    // inserções e exclusoes sao rapidas
    public static void main(String[] args) {
        exemploListaSimples();
        //exemploListaSimplesAscendente();
    }

    private static void exemploListaSimples(){
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antônio Souza");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");

        lista.remove(0);
        boolean contem = lista.contains("João da Silva");
        System.out.println(lista);
        System.out.println(contem);

        for (String nome : lista){
            System.out.println(nome);
        }

        System.out.println(lista.get(0));

    }

    private static void exemploListaSimplesAscendente(){
        System.out.println("**** exemploListaSimplesAscendente ***");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antônio Souza");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
