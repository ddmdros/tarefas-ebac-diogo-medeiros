package br.com.ddmdros.set;

import br.com.ddmdros.domain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ebac1HashSet {

    //Hash set acessa mais rapido que TreeSet
    // dados podem estar desordenados

    public static void main(String[] args) {
        exemploHashSet();
        exemploHashSetAluno();

    }

    public static  void exemploHashSet(){
        System.out.println("**** HashSet ****");
        Set<String> lista = new HashSet<>();
        lista.add("Diogo Medeiros");
        lista.add("Antônio Sousa");
        lista.add("Joao da Silva");
        lista.add("Joao da Silva"); // hashset nao adiciona informacao repetida na lista
        System.out.println(lista);
        //Collections.sort(lista);
        System.out.println("");
        lista.remove("Antônio Sousa");
        System.out.println("Lista depois do remove " + lista);

    }

    //obs: para que o hashset nao repita objetos de classes
    // a classe tem que ter equals e hashcode
    // clica na classe, alt ins, equals e hashcode
    public static void exemploHashSetAluno(){
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("João da Silva", "Linux Básico", 0);
        Aluno b = new Aluno("Antônio Sousa", "Open Office", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antônio Sousa", "Open Office", 0);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

    }

    //TreeSet mais lento,
    // ordem natural: 1, 2, 3
    // ele tem um sorted automático, independente da ordem que vc inserir
    // tempo similar a O(logn)

    // LinkedHashSet
    // mantêm a ordem em que foram inseridos
    // desempenho intermediario



}
