package br.com.ddmdros.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ebac1 {


    public static void main(String[] args) {
        exemploListaSimples();


    }
    //hashmap
    //ordenação nao é importante
    // permite valores nulos
    // usa chaves de ID p ordenação
    //ex: livros por isbn

    public static void exemploListaSimples(){
        System.out.println("****** exemploListaSimples ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        //imprime a lista
        System.out.println(lista);
        System.out.println("");

        //imprime apenas o valor na lista
        for (String value : lista.values()){
            System.out.println(value);
        }

        //imprime só a chave
        for (Integer value : lista.keySet()){
            System.out.println(value);
        }

        //imprime qqr um dos dois (chave ou valor)
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e: entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }
        //tb é´possível usar lambda e streams pra
        // acelerar o código, mas vamos ver isso dps
    }

    //treeMap
    //ordem ascendente das chaves

    //linkedHashMap
    //meio termo dos dois em ordenação e desempenho
    //mantem ordem inserida

}
