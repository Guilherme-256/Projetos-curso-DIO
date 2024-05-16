package SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
//atributo
private List<Integer> numerosList;

public SomaNumeros() {
    this.numerosList = new ArrayList<>();
}
public void adicionarNumero(int numero){
    numerosList.add(numero);
}

public int calcularSoma(){
    int soma = 0;
if (!numerosList.isEmpty()) {
    for (Integer i : numerosList) {
        soma += i;
    }
}
return soma;
}

public int encontrarMaiorNumero(){
    int maiorNumero = Integer.MIN_VALUE;
    if (!numerosList.isEmpty()) {
        for (Integer i : numerosList) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
        }
        return maiorNumero;
    } else{
        throw new RuntimeException("A lista está vazia!");
    }
    
}

public int encontrarMenorNumero(){
    int menorNumero = Integer.MAX_VALUE;
    if (!numerosList.isEmpty()) {
        for (Integer i : numerosList) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        return menorNumero;
    } else{
        throw new RuntimeException("A lista está vazia!");
    }
    
}
 
public void exibirNumeros(){
System.out.println(numerosList);
}

@Override
public String toString() {
    return "SomaNumeros [numerosList=" + numerosList + "]";
}


// Teste do funcionamento das Classes

public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(15);
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(20);
    somaNumeros.adicionarNumero(90);

    somaNumeros.exibirNumeros();
    System.out.println(somaNumeros.encontrarMaiorNumero());
    System.out.println(somaNumeros.encontrarMenorNumero());
    System.out.println(somaNumeros.calcularSoma());
}
}
