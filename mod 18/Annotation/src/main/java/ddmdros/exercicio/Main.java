package ddmdros.exercicio;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic");

        String tabela = "carro";

        System.out.println("Objeto: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Tabela associada: " + tabela);
    }
}
