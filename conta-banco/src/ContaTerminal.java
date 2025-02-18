import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Olá, Por favor digite o numero da conta: \n");
        int conta = scanner.nextInt();
        
        System.out.print("Sua agência: \n");
        String agencia = scanner.next();


        System.out.print("Seu nome: \n");
        String nome = scanner.next();

        System.out.print("Digite seu saldo: \n");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
