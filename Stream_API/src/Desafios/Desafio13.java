package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNoIntervalo = numeros.stream().filter(n -> n > 5 && n < 10).toList();

        System.out.println(numerosNoIntervalo);
    }
}
