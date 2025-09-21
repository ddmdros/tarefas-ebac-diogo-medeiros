package br.com.ddmdros.facade;

public class ApartamentoService implements IApartamentoService {
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && !isCamposValidos){
            return false;
        }

        return cadastrarNoBanco(apartamento);

    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        //Ir no banco de dados e verificar se está cadastrado
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento){
        return true;
    }

    private boolean cadastrarNoBanco(Apartamento apartamento){
        //logica de cadastro
        return true;
    }
}
