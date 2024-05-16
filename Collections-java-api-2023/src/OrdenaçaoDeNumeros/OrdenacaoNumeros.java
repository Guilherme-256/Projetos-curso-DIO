package OrdenaçaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {

//atibutos
List<Integer> numerosList;

public OrdenacaoNumeros() {
    this.numerosList = new ArrayList<>();
}

public void adicionarNumero(int numero){
numerosList.add(numero);
}

public List<Integer> ordenarAscendente(){
    List<Integer> numerosOrdenadosAscList = new ArrayList<>(this.numerosList);
if (!numerosList.isEmpty()) {
    Collections.sort(numerosOrdenadosAscList);
    return numerosOrdenadosAscList;
}else{
    throw new RuntimeException("A lista está vazia!");
}
}

public List<Integer> ordenarDescendente(){
    List<Integer> numerosOrdenadosDescList = new ArrayList<>(numerosList);
    if (!numerosList.isEmpty()) {
       numerosOrdenadosDescList.sort(Collections.reverseOrder());
       return numerosOrdenadosDescList;
    } else {
        throw new RuntimeException("A lista está vazia!");
    }
}
public void exibirNumeros() {
    if (!numerosList.isEmpty()) {
        System.out.println(numerosList);
    } else {
        throw new RuntimeException("A lista está vazia!");
    }
}
 
//Testando o funcionamento das Classes

public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(9);
    numeros.adicionarNumero(8);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(100);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println(numeros.ordenarAscendente());

    // Ordenando e exibindo em ordem descendente
    System.out.println(numeros.ordenarDescendente());

}
}
