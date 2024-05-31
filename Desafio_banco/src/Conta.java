public abstract class Conta {
    // atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(String nome) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.cliente = new Cliente(nome);
    }

    private static final int AGENCIA_PADRAO = 1;

    private static int sequencial = 1;

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesComuns() {
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }

    public void imprimirExtrato() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "[ cliente: " + cliente + ", agencia: " + agencia + ", numero: " + numero + ", saldo: " + saldo + " ]";
    }
}
