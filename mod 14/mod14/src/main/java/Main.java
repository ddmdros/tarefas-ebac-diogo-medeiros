import br.com.ddmros.dao.ClienteMapDAO;
import br.com.ddmros.dao.IClienteDAO;
import br.com.ddmros.domain.Cliente;

import javax.swing.*;

public class Main {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida. Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isOpcaoCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula, como no exemplo:\n" +
                                "Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                        "Cadastro",
                        JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);

            } else if (isOpcaoConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente",
                        "Consulta",
                        JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);

            } else if (isOpcaoExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente",
                        "Exclusão",
                        JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);

            } else { // opção 4 - alterar
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula, conforme o exemplo:\n" +
                                "Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                        "Atualização",
                        JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Menu",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente encontrado:\n" + cliente.toString(),
                    "Consulta",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");

        if (dadosSeparados.length != 7) {
            JOptionPane.showMessageDialog(null,
                    "Dados inválidos! Informe: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(
                dadosSeparados[0].trim(),
                dadosSeparados[1].trim(),
                dadosSeparados[2].trim(),
                dadosSeparados[3].trim(),
                dadosSeparados[4].trim(),
                dadosSeparados[5].trim(),
                dadosSeparados[6].trim()
        );

        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        if (isCadastrado) {
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente já cadastrado",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");

        if (dadosSeparados.length != 7) {
            JOptionPane.showMessageDialog(null,
                    "Dados inválidos! Informe: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(
                dadosSeparados[0].trim(),
                dadosSeparados[1].trim(),
                dadosSeparados[2].trim(),
                dadosSeparados[3].trim(),
                dadosSeparados[4].trim(),
                dadosSeparados[5].trim(),
                dadosSeparados[6].trim()
        );

        Cliente atualizado = iClienteDAO.alterar(cliente);

        if (atualizado != null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente atualizado com sucesso",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado para atualização",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void excluir(String cpf) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpf));
        if (cliente != null) {
            iClienteDAO.excluir(Long.parseLong(cpf));
            JOptionPane.showMessageDialog(null,
                    "Cliente excluído com sucesso",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null,
                "Até logo",
                "Sair",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
                || "4".equals(opcao) || "5".equals(opcao);
    }

    private static boolean isOpcaoCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static boolean isOpcaoConsulta(String opcao) {
        return "2".equals(opcao);
    }

    private static boolean isOpcaoExcluir(String opcao) {
        return "3".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }
}
