import java.util.*;

public class main {


    public static void main(String[] args) {
        tarefa1();
        tarefa2();
    }

    /**
     * Tarefa 1:
     *     Lê o nome de pessoas no console separado por vifgula
     *     Separa os valores
     *     Guarda as variaveis
     *     Remove as vírgulas da lista
     *     Faz a ordenação em ordem alfabetica
     *     Imprime no console
     */
    public static void tarefa1(){
        System.out.println("**** TAREFA 1 ****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula: ");
        //HashSet<String> lista = new HashSet<>();
        List<String> lista = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));
        lista.replaceAll(String::trim);
        System.out.println("Você inseriu: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordem alfabética: " + lista);

    }

    /**
     *  TAREFA 2
     *  Lê um nome no console - genero
     *  Rodrigo - M
     *  Lê os resultados
     *  Separa por grupos por gênero
     *  Imprime no console com os grupos separados
     */

    public static void tarefa2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes seguidos por um traço e o gênero da pessoa e uma vírgula para adicionar a próxima. Ex(Rodrigo - M, Maria - F): ");
        String[] pessoas = scanner.nextLine().split(",");
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();

        for (String p : pessoas) {
            String[] partes = p.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim();

                Pessoa pessoa = new Pessoa(nome, genero);

                if (genero.equalsIgnoreCase("M")) {
                    masculinos.add(pessoa);
                } else if (genero.equalsIgnoreCase("F")) {
                    femininos.add(pessoa);
                }
            }
        }

        masculinos.sort(Comparator.comparing(Pessoa::getNome));
        femininos.sort(Comparator.comparing(Pessoa::getNome));

        System.out.println("Gênero masculino:");
        for (Pessoa m : masculinos) {
            System.out.println(m.getNome());
        }

        System.out.println("\nGênero feminino:");
        for (Pessoa f : femininos) {
            System.out.println(f.getNome());
        }
    }
}
