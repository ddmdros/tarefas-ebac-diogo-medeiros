package br.com.ddmdros.injecao;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        new MigracaoUsuario(
                new FileReader(),
                new BdWriter()).migrar();
    }

    static class MigracaoUsuario {

        Reader<User> reader;
        Writer<User> writer;

        MigracaoUsuario(Reader<User> reader, Writer<User> writer){
            this.writer = writer;
            this.reader = reader;
        }

        void migrar() {
            List<User> users = reader.read();
            writer.write(users);
        }
    }

    record User(String email, String username, String password){}

    interface Reader<T>{
        List<T> read();
    }

    interface Writer<T>{
        void write(List<T> itens);
    }

    static class FileReader implements Reader<User>{
        public List<User> read(){
            System.out.println("Lendo usuários do arquivo...");
            return List.of(new User("email", "username", "password"));
        }
    }

    static class BdWriter implements Writer<User> {
        public void write(List<User> users){
            System.out.println("Escrevendo usuários no banco");
            System.out.println(users);
        }
    }

}
