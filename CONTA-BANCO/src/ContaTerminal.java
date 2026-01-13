// Este programa realiza uma simulação de boas-vindas ao usuário de uma agência bancária
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nomeCliente, agencia;
        int numeroConta;
        double saldoConta;
        
        // Solicitando a entrada de dados do usuário
        System.out.println("Por favor, digite o numero da sua conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o numero de sua agencia: ");
        agencia = sc.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldoConta = sc.nextDouble();
        sc.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();

        // Exibindo a mensagem de boas-vindas ao usuário
        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agencia é: " + agencia + ", conta: " + numeroConta + " e seu saldo " + saldoConta + " já está disponivel para saque.");

    }
}
