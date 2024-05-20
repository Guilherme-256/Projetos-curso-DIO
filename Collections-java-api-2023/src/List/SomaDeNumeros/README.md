# 📊 Projeto: Soma de Números

Este projeto implementa uma classe chamada `SomaNumeros` em Java. A classe possui uma lista de números inteiros como atributo e oferece métodos para adicionar números à lista, calcular a soma dos números, encontrar o maior e o menor número, e exibir todos os números da lista.

## 🚀 Classe `SomaNumeros`
A classe  `SomaNumeros` possui os seguintes métodos:

- `adicionarNumero(int numero)`➕ Adiciona um número à lista de números inteiros.
- `calcularSoma()`➕ Calcula a soma de todos os números na lista e retorna o resultado.
- `encontrarMaiorNumero()`📈 Encontra o maior número na lista e retorna o valor.
- `encontrarMenorNumero()`📉 Encontra o menor número na lista e retorna o valor.
- `exibirNumeros()`📋  Retorna uma lista contendo todos os números presentes na lista.


## 🛠️ Como usar

### Crie uma instância da classe SomaNumeros:
```java
SomaNumeros somaNumeros = new SomaNumeros();
```
### Para adicionar números à lista:
```java
somaNumeros.adicionarNumero(10);
somaNumeros.adicionarNumero(15);
somaNumeros.adicionarNumero(5);
somaNumeros.adicionarNumero(20);
somaNumeros.adicionarNumero(90);
```
### Para exibir a lista de números adicionados:
```java
somaNumeros.exibirNumeros();
```
### Para calcular a soma dos números:
```java
System.out.println(somaNumeros.calcularSoma());
```
### Para exibir o maior número:
```java
 System.out.println(somaNumeros.encontrarMaiorNumero());
```
### Para exibir o menor número:
```java
System.out.println(somaNumeros.encontrarMenorNumero());
```

