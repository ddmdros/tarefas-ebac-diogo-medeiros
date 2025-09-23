package ddmdros.exercicio;

@Tabela(nome = "carro")
public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
}
