package lab_padroes_projeto_java.dio.projeto.subsistema1crm;

public class CrmService {

    private CrmService(){}

public static void gravarClinete(String nome,String cep,String cidade,String estado){
    System.out.println("Cliente salvo no sistema de Crm");
    System.out.println(nome);
    System.out.println(cep);
    System.out.println(cidade);
    System.out.println(estado);
}
}
