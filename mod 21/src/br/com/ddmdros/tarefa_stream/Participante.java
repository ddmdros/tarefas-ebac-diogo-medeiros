package br.com.ddmdros.tarefa_stream;

public class Participante {
    private String nome;
    private Character genero;

    public Participante(String nome, Character genero){
        this.genero = genero;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero +
                '}';
    }
}
