import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = Scanner.nextInt();

        System.out.print("Digite sua conta : ");
        int numeroConta = Scanner.nextInt();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = Scanner.next();
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = Scanner.nextDouble();  

        System.out.print("Olá " + nomeCliente );

        System.out.print(" obrigado por criar a sua conta em nosso Banco ");

        System.out.print(" sua agência é " + numeroAgencia);

        System.out.print(" conta"+ numeroConta);

        System.out.print(" seu saldo é"+ saldo);

        System.out.print(" já está disponivel para saque");




    }
}
