import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
        System.out.println("""
                            Digite:
                            1 para adicionar uma pessoa física
                            2 para adicionar uma pessoa jurídica
                            0 para sair\n""");
        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Digite o nome da pessoa a ser cadastrada: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o CPF da pessoa a ser cadastrada (apenas os números, sem pontos): ");
            String CPF = scanner.nextLine();
            PessoaFisica pessoa1 = criarPessoa(nome,CPF);
            lista.add(pessoa1);
            System.out.println("Cliente \'"+ pessoa1.getNome() + "\' adicionado com sucesso!");
        } else if (opcao == 2){

            System.out.println("Digite o nome da empresa a ser cadastrada: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o CNPJ da empresa a ser cadastrada: ");
            String CNPJ = scanner.nextLine();

            PessoaJuridica empresa = criarEmpresa(nome,CNPJ);
            lista.add(empresa);

            System.out.println("Empresa \'" + empresa.getNome() + "\' adicionada com sucesso!");


        } else if (opcao==0){

            System.out.println("Incluído no cadastro: ");

            for (Pessoa p : lista){
                    System.out.println("Nome: "+ p.getNome());
                if (p instanceof PessoaJuridica){
                    System.out.println("CNPJ: " + ((PessoaJuridica) p).getCNPJ());
                } else if (p instanceof  PessoaFisica){
                    System.out.println("CPF: " + ((PessoaFisica) p).getCPF());
                }
            }

        } else {

            System.out.println("Opção inválida. ");

        }
        }
        while (opcao != 0);
    }

    public static PessoaFisica criarPessoa(String nome, String CPF){
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome(nome);
        pessoa.setCPF(CPF);
        return pessoa;
    }

    public static PessoaJuridica criarEmpresa(String nome, String CNPJ){
        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setCNPJ(CNPJ);
        empresa.setNome(nome);
        return empresa;
    }
}
