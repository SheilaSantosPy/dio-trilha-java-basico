import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a, b, soma;

       // Pedindo ao usuário para realizar a entrada dos números
       System.out.println("Digite o primeiro número: ");
       a = sc.nextInt();

       System.out.println("Digite o segundo número: ");
       b = sc.nextInt();

       //Resultado
       soma = a + b;
       System.out.println("SOMA = " + soma);
    }
}
