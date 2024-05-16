# 📚 Catálogo de Livros

Bem-vindo ao projeto **Catálogo de Livros**! Este é um sistema simples para gerenciar um catálogo de livros, permitindo adicionar novos livros e pesquisar por autor, intervalo de anos e título. Este projeto foi desenvolvido com o objetivo de aprendizado dos conceitos de pesquisa em coleções em Java.

## 🌟 Funcionalidades

A classe principal deste projeto é `CatalogoLivros`, que possui uma lista de objetos do tipo `Livro` como atributo. A classe `Livro` contém informações como título, autor e ano de publicação. Abaixo estão as funcionalidades implementadas:

- **➕Adicionar Livro:** Adiciona um novo livro ao catálogo.
- **🔍Pesquisar por Autor:** Pesquisa livros no catálogo por autor.
- **📅Pesquisar por Intervalo de Anos:** Pesquisa livros publicados em um determinado intervalo de anos.
- **🔎Pesquisar por Título:** Pesquisa livros no catálogo por título.

## 🗂️ Estrutura do Projeto

O projeto está estruturado da seguinte forma:

```
├── CatalogoLivros.java
├── Livro.java
└── README.md
```


## 🛠️ Implementação

### 📖 Classe `Livro`

A classe `Livro` representa um livro com os seguintes atributos:
- `titulo`: O título do livro.
- `autor`: O autor do livro.
- `anoPublicacao`: O ano de publicação do livro.  

A classe livro também apresenta o método `toString` sobrescrito.

```java
package CatálogoDeLivros;

public class Livro {
    // atributo
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " , Autor: " + autor + " , Ano de Publicação: " + anoPublicacao + "\n";
    }

}
```
### 📚 Classe `CatalogoLivros`

A classe `CatalogoLivros` gerencia a lista de livros e implementa os métodos para adicionar e pesquisar livros.

```java
package CatálogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributos
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                }
                break;
            }
        }
        return livroPorTitulo;
    }

    // Teste do funcionamento das classes

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}

```

## 🚀 Como Usar 

### ➕ Adicionando Livros

Para adicionar um livro ao catálogo, use o método `adicionarLivro`.

```java
// Instanciando a classe CatalogoLivros
CatalogoLivros catalogo = new CatalogoLivros();

catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
catalogo.adicionarLivro("1984", "George Orwell", 1949);
```

### 🔍 Pesquisando Livros

Você pode pesquisar livros por autor, intervalo de anos ou título.

#### 🔍 Pesquisar por Autor

```java
System.out.println(catalogoLivros.pesquisarPorAutor("George Orwell"));
```

#### 📅 Pesquisar por Intervalo de Anos

```java
System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1940, 1960));
```

#### 🔎 Pesquisar por Título

```java
System.out.println(catalogoLivros.pesquisarPorTitulo("O Senhor dos Anéis"));
```

## 📢 Conclusão

Este projeto fornece uma implementação básica de um catálogo de livros, com funcionalidades para adicionar e pesquisar livros por diferentes critérios.