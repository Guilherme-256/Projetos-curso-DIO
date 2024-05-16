package CarrinhoDeCompras;

public class Item {
    // atributos
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " , Preço: " + preco + " , Quantidade: " + quantidade + "\n";
    }

}
