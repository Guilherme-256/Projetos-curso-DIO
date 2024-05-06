import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	/*
	 * Esse algoritmo tem por objetivo praticar os conceitos de controle de 
	 * fluxo e tratamento de exceções na linguagem Java desenvolvendo um
	 * algoritmo que imprima uma sequência de números cujo tamanho é igual
	 * à diferença entre os dois Inputs começando a partir do número 1.
	 */
	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro:");
			int parametroUm = ler.nextInt();
			System.out.println("Digite o segundo parâmetro:");
			int parametroDois = ler.nextInt();
			ler.close();
			try {
				// chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);

			} catch (ParametrosInvalidosException exception) {
				// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println(exception.toString());
			}
		} catch (InputMismatchException e) {
			// Imprimir uma mensagem caso haja algum erro nos input
			System.out.println("Algo de errado\nOs números devem ser números inteiros.");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException(parametroUm, parametroDois);
		}

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo número " + i + ".");
		}
	}
}