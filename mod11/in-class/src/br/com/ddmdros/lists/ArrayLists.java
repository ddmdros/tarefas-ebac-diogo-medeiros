package br.com.ddmdros.lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

// É como um array que pode crescer.
// busca rápida
// inserções e exclusões lentas e lineares
// ex. aplicação: catálogo com livros. cada obra recebe
//numero sequencial para acesso.
    public static void main(String[] args) {
        //exemploListaSimples();
        //exemploListaAscendente();
        // exemploNumeros();
        exemploListaOrdenadaAluno();
    }

    private static void exemploListaSimples(){
        System.out.println("******* exemploListaSimples ******");
        //List<Integer> numeros = new ArrayList<>();
        List<String> lista = new ArrayList<>();
        lista.add("Diogo Medeiros");
        lista.add("João da Silva");
        lista.add("Antônio Souza");
        lista.add("Lícia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaAscendente(){
        System.out.println("**** exemploListaAscendente ****");
        List<String> lista = new ArrayList<>();
        lista.add("Diogo Medeiros");
        lista.add("João da Silva");
        lista.add("Antônio Souza");
        lista.add("Lícia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploNumeros(){
        System.out.println("**** exemploNumeros ****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(17);
        System.out.println(numeros);
    }

    private static void exemploListaOrdenadaAluno(){
        System.out.println("****exemploListaOrdenadaAluno****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antônio Sousa", "Open Office", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

    }

}
