import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        /*
         * Este algoritmo tem por objetivo receber dados via terminal contendo
         * características de uma conta em banco e imprimir uma mensagem compilando
         * esses dados.
         * O algoritmo foi feito com a intenção de trabalhar o máximo de conceitos
         * básicos da linguagem Java possível.
         */
        public static void main(String[] args) {
                // Variáveis utilizadas
                String nome = "", agencia = "";
                int numeroId = 0;
                double saldo = 0;
                boolean inputInvalido;
                // Instanciando a classe Scanner no objeto "ler".
                Scanner ler = new Scanner(System.in).useLocale(Locale.US);
                // Do While utilizado para caso haja alguma exceção nos inputs esse trecho de
                // código seja repetido
                do {
                        inputInvalido = false;
                        try {
                                // Recebendo os dados via terminal.
                                System.out.println("Por favor, digite o seu nome completo:");
                                nome = ler.nextLine();
                                System.out.println("Por favor, digite o número da sua agência:");
                                agencia = ler.next();
                                System.out.println("Por favor, digite o seu número de ID: ");
                                numeroId = ler.nextInt();
                                System.out.println(
                                                "Por favor, digite o valor a ser acrescentado ao seu saldo (separe as casas decimais por ponto):");
                                saldo = ler.nextDouble();
                        } catch (InputMismatchException e) {
                                // Mensagem exibida caso ocurra um input incorreto
                                System.out.println("Entrada inválida. Por favor, tente novamente.");
                                System.out.println(
                                                "O ID deve ser composto de números inteiro e o Saldo deve ter as casas decimais separadas por ponto.");
                                inputInvalido = true; // Variável que determina a repetição do trecho de código
                                ler.nextLine(); // Descarta a entrada inválida
                        }
                } while (inputInvalido);

                ler.close(); // Encerrando o uso do Scanner.

                // Imprimindo o texto compilando os dados obtidos.
                System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                                + agencia
                                + ", conta " + numeroId + " e seu saldo " + saldo + " já está disponível para saque.");
        }
}
