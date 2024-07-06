package lab_padroes_projeto_java.dio.projeto.subsistema2cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade (String cep){
        return "Betim";
    }
    public String recuperarEstado (String cep){
        return "MG";
    }
}
