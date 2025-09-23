package ddmdros.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do cliente: ");
        String mensagem = scanner.nextLine();


        try{
        ClienteService.consutarCliente("opcao");
        }catch(ClienteNaoEncontrado2Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
