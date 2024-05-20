package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensList.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()) {
            for (Item i : itensList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
        }
        itensList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;
        if (!itensList.isEmpty()) {
            for (Item i : itensList) {
                total += i.getPreco() * i.getQuantidade();
            }
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(itensList);
    }

    // Teste do funcionamento das classes
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Item 1", 2.50, 5);
        carrinhoDeCompras.adicionarItem("Item 2", 5, 4);
        carrinhoDeCompras.adicionarItem("Item 3", 4.90, 2);
        carrinhoDeCompras.adicionarItem("Item 4", 3.50, 6);
        carrinhoDeCompras.adicionarItem("Item 5", 8.50, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        System.out.println("---------------------------------------------------");
        carrinhoDeCompras.removerItem("Item 4");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }

}
