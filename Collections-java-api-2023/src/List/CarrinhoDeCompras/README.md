# 🛒 Carrinho De Compras

Bem-vindo ao projeto **Carrinho De Compras**! Este projeto implementa uma classe chamada `CarrinhoDeCompras`, que representa um carrinho de compras online. O carrinho é implementado como uma lista de itens, onde cada item é representado por uma instância da classe `Item`.

## 🌟 Funcionalidades

A classe `CarrinhoDeCompras` possui os seguintes métodos:

- **➕adicionarItem(String nome, double preco, int quantidade)** Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- **➖removerItem(String nome)** Remove um item do carrinho com base no seu nome.
- **💰calcularValorTotal()** Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- **📋exibirItens()** Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

## 🏗️  Estrutura do Projeto

O projeto contém duas classes principais: `Item` e `CarrinhoDeCompras`.


## 🛠️ Implementação

### 🛍️ Classe Item

A classe `Item` possui os seguintes atributos:
- `nome`: Nome do item.
- `preco`: Preço do item.
- `quantidade`: Quantidade do item. 

A classe `Item` também apresenta o método `toString` sobrescrito.

```java
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
```
### 🛒 Classe CarrinhoDeCompras

A classe `CarrinhoDeCompras` possui uma lista de itens e implementa os métodos para manipulação dos itens no carrinho.

```java
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

```

## 🚀 Como Usar 

### Criar uma instância de CarrinhoDeCompras:
```java
 CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
```

### Adicionar itens ao carrinho:
```java
carrinhoDeCompras.adicionarItem("Item 1", 2.50, 5);
carrinhoDeCompras.adicionarItem("Item 2", 5, 4);
carrinhoDeCompras.adicionarItem("Item 3", 4.90, 2);
carrinhoDeCompras.adicionarItem("Item 4", 3.50, 6);
carrinhoDeCompras.adicionarItem("Item 5", 8.50, 1);
```


#### Remover um item do carrinho:

```java
carrinhoDeCompras.removerItem("Item 4");
```

#### Calcular e mostrar o valor total do carrinho:

```java
System.out.println(carrinhoDeCompras.calcularValorTotal());
```

#### Exibir itens no carrinho:

```java
carrinhoDeCompras.exibirItens();
```

## 🏁 Conclusão

Este projeto fornece uma implementação básica de um carrinho de compras, servindo como uma ótima introdução à programação orientada a objetos e ao gerenciamento de dados em listas.