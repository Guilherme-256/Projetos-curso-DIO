# 📝Lista de Tarefas em Java

Este é um projeto simples em Java que implementa uma lista de tarefas. Cada tarefa é representada por um objeto da classe `Tarefa`, que possui um atributo de descrição. A lista de tarefas é gerenciada pela classe `ListaTarefas`.

## Funcionalidades

- Adicionar uma nova tarefa à lista.
- Remover uma tarefa da lista com base em sua descrição.
- Obter o número total de tarefas na lista.
- Obter as descrições de todas as tarefas na lista.

## Classes

### `Tarefa`

- A classe `Tarefa` representa uma única tarefa.
- Atributos:
  - `descricao`: Descrição da tarefa.
- Métodos:
  - Construtor: Cria uma nova instância de `Tarefa` com a descrição fornecida.
  - Getters e setters para o atributo `descricao`.

### `ListaTarefas`

- A classe `ListaTarefas` mantém uma lista de objetos `Tarefa`.
- Atributos:
  - `listaDeTarefas`: Lista que armazena as tarefas.
- Métodos:
  - `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.
  - `removerTarefa(String descricao)`: Remove uma tarefa da lista com base em sua descrição.
  - `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.
  - `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas na lista.

## Exemplo de Uso

Aqui está um exemplo de como usar a classe `ListaTarefas`:

```java
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        // Obtendo o número total de tarefas para verificar que a lista é vazia inicialmente 
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas() );
        // Adicionando tarefas
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        
        // Obtendo o número total de tarefas 
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas() );
        
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Tarefa 2");
        
        // Obtendo o número total de tarefas após remoção
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas() );

        // Obtendo as descrições das tarefas
        listaTarefas.obterDescricoesTarefas();
        
    }
}
