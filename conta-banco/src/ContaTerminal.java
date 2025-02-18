import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, Por favor digite o numero da conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Sua agência: ");
        String agencia = scanner.next();


        System.out.println("Seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
