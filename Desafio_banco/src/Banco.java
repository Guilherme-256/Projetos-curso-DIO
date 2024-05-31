import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contasList;

    public void listarContas(){
        System.out.println(contasList);
    }

    public Banco() {
        this.contasList = new ArrayList<>();
    }

    public void adicionarContaCorrente(String nome) {
        contasList.add(new ContaCorrente(nome));

    }

    public void adicionarContaPoupanca(String nome) {
        contasList.add(new ContaPoupanca(nome));

    }

    public Conta consultarPorNomeNumero(String nome, int numero) {
        Conta contaProcurada = null;
        if (!contasList.isEmpty()) {
            for (Conta conta : contasList) {
                if (conta.getCliente().getNome().equals(nome) && conta.getNumero() == numero) {
contaProcurada = conta;
break;
                }
            }
        }
        return contaProcurada;
    }

    // Teste do funcionamento das classes 

    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.adicionarContaCorrente("Guilherme");
        banco.adicionarContaPoupanca("Denise");

        banco.consultarPorNomeNumero("Guilherme", 1).depositar(1000);
        banco.consultarPorNomeNumero("Guilherme", 1).transferir(500, banco.consultarPorNomeNumero("Denise", 2));
        banco.consultarPorNomeNumero("Guilherme", 1).imprimirExtrato();
        
        banco.consultarPorNomeNumero("Denise", 2).depositar(1000);
        banco.consultarPorNomeNumero("Denise", 2).imprimirExtrato();
        System.out.println("----------------------------------------");
        banco.consultarPorNomeNumero("Denise", 2).sacar(1000);
        banco.consultarPorNomeNumero("Denise", 2).imprimirExtrato();

        banco.listarContas();

    }
}
