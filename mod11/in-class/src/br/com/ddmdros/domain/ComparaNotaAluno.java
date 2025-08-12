package br.com.ddmdros.domain;

import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno> {

    public int compare (Aluno o1, Aluno o2){
        return Double.compare(o2.getNota(), o1.getNota());
    }


}
