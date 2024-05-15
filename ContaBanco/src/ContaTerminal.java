import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Por favor, informe o seu Nome!");
        String nome = sc.next();

        System.out.println("Agora informe o seu Sobrenome, por gentileza!");
        String sobrenome = sc.next();

        System.out.println("Por favor, digite o número da Agência!");   
        String numeroAgencia = sc.next();

        System.out.println("Digite o número da Conta, com o dígito se houver!");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, informe o seu saldo!");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        sc.close();
    }
    
}