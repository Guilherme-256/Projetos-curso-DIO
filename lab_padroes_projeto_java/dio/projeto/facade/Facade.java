package lab_padroes_projeto_java.dio.projeto.facade;

import lab_padroes_projeto_java.dio.projeto.subsistema1crm.CrmService;
import lab_padroes_projeto_java.dio.projeto.subsistema2cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarClinete(nome, cep, cidade, estado);

    }
}
