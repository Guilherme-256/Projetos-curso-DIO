import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /*
     Este algoritimo tem por objetivo receber dados via terminal contendo características de uma conta em banco e imprir uma mensagem compilando esses dados.
     O algoritimo foi feito com a intenção de trabalhar o máximo de conceitos básicos da linguagem Java o possível.
     */
    public static void main(String[] args) {   
        // Variáveis ultilizadas
        String nome, agencia;
        int numeroId;
        double saldo;
        // Instanciando a classe Scanner no objeto "ler".
        Scanner ler = new Scanner(System.in).useLocale(Locale.US); 
        //  Recebendo os dados via terminal.
        System.out.println("Por favor, digite o seu nome completo:");
        nome = ler.nextLine();
        System.out.println("Por favor, digite o número da sua agência:");
        agencia = ler.next();
        System.out.println("Por favor, digite o seu número de ID: ");
        numeroId = ler.nextInt();
        System.out.println(
                "Por favor, digite o valor a ser acrescentado ao seu saldo (separe as casas decimais por ponto):");
        saldo = ler.nextDouble();
        ler.close(); // Encerrando o uso do Scanner.

// Imprimindo o texto compilando os dados obtidos.
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroId + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
