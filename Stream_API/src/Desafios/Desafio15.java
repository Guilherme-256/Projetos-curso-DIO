package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Há algum número negativo ? " + numeros.stream().anyMatch(n -> n < 0));
    }
}
