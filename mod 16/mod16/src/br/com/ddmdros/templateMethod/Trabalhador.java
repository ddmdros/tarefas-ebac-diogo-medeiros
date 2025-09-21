package br.com.ddmdros.templateMethod;

public abstract class Trabalhador {

    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }
    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }


    private void irAoTrabalho() {
        System.out.println("Indo para o trabalho");
    }

    private void levantar() {
        System.out.println("Levantando");
    }

    private void iniciarRotina() {
        System.out.println("Iniciando rotina");
    }
}
