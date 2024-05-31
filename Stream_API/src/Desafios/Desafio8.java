package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
public static void main(String[] args) {
    // Somar os dígitos de todos os números da lista:
   List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int somaDigitos = numeros.stream().mapToInt(n -> {
        int sum = 0, length = String.valueOf(n).length();
        for (int i = 0; i < length; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }).sum();

    System.out.println(somaDigitos);
}
}
