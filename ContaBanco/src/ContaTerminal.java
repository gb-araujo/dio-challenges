import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo, para acessar sua conta deve inserir os dados a seguir:");
        System.out.println("Digite o número da conta");
        numero = sc.nextInt();
        System.out.println("Digite a agência");
        agencia = sc.next();
        System.out.println("Digite o seu nome completo");
        nomeCliente = sc.next();
        System.out.println("Adicione um saldo");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque".formatted(nomeCliente, agencia,numero, saldo) );



    }
}