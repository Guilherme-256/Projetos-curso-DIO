package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
public static void main(String[] args) {
    //Desafio 5 - Calcule a média dos números maiores que 5:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

double resultado = numeros.stream().filter(n -> n > 5).reduce(0,(n1,n2) -> n1 + n2 );
resultado = resultado/ numeros.stream().filter(n->n>5).count();

System.out.println(resultado);
}
}
