package lab_padroes_projeto_java.dio.projeto.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente");
    }

}
