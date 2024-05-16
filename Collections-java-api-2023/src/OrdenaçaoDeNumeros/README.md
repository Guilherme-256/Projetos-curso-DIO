# 📊 Ordenação de Números

Este é um projeto simples que implementa uma classe chamada `OrdenacaoNumeros` em Java, que possui uma lista de números inteiros como atributo e oferece métodos para adicionar números à lista e ordená-la de forma ascendente ou descendente.

## 🚀 Classe `OrdenacaoNumeros`
A classe  `OrdenacaoNumeros` possui os seguintes métodos:

- `adicionarNumero(int numero)`➕ Adiciona um número à lista de números inteiros.
- `ordenarAscendente()`📈 Ordena os números da lista em ordem ascendente.
- `ordenarDescendente()`📉 Ordena os números da lista em ordem descendente.
- `exibirNumeros()`📋 Mostra todos os números adicionados a lista


## 🛠️ Como usar

### Crie uma instância da classe OrdenacaoNumeros:
```java
OrdenacaoNumeros numeros = new OrdenacaoNumeros();
```
### Para adicionar números à lista:
```java
numeros.adicionarNumero(2);
numeros.adicionarNumero(9);
numeros.adicionarNumero(8);
numeros.adicionarNumero(1);
numeros.adicionarNumero(100);
```
### Para exibir a lista de números adicionados:
```java
numeros.exibirNumeros();
```
### Para ordenar e exibir os números em ordem ascendente:
```java
 System.out.println(numeros.ordenarAscendente());
```
### Para ordenar e exibir os números em ordem descendente:
```java
System.out.println(numeros.ordenarDescendente());
```

