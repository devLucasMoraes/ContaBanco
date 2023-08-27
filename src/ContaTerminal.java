import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome !");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da agência !");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da conta !");
        numero = sc.nextInt();
        System.out.println("Informe o valor do deposito inicial:");
        saldo = sc.nextBigDecimal();

        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);


    }
}