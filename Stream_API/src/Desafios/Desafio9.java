package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        // Verificar se todos os números da lista são distintos (não se repetem):
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        if (numeros.stream().count() == numeros.stream().distinct().count()) {
            System.out.println("Não há números duplicados.");
        } else{
            System.out.println("Há números duplicados.");
        }

    }
}
