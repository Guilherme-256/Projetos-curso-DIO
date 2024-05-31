package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

    public static void main(String[] args) {
        //Desafio 16 - Agrupe os números em pares e ímpares:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> numerosPares = numeros.stream().filter(n -> n%2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(n -> n%2 != 0).toList();

        System.out.println("Pares :" + numerosPares);
        System.out.println("Ímpares :" + numerosImpares);

    }
}
