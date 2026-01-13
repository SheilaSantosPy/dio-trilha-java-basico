import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int A, B, PROD;

       // Pedindo ao usuário para realizar a entrada dos números
       System.out.println("Digite o primeiro número: ");
       A = sc.nextInt();

       System.out.println("Digite o segundo número: ");
       B = sc.nextInt();

       //Resultado
       PROD = A * B;
       System.out.println("PROD = " + PROD);
    }
}
