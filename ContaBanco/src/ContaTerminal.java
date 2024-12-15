import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner (System.in);
    
     System.out.println("Digite seu nome.");
     String nome = scanner.next ();

     System.out.println("Digite seu Sobrenome.");
     String sobrenome = scanner.next ();

     System.out.println(" Olá" + "  "+ nome + " por favor, digite o numero de sua agência.");
     String agência = scanner.next();

     System.out.println(" Agora digite sua conta.");
     int conta = scanner.nextInt();


     System.out.println(" Digite abaixo o valor do deposito.");
     double saldo = scanner.nextDouble();


     System.out.println("Olá Sr(a) " + nome + " "+ sobrenome +",Obrigada por criar uma conta em nosso banco.");
     System.out.println("Sua agência é " + agência +",sua conta " + conta + ", e seu saldo de " + saldo + " "+ "já está disponivel para saque.");

    }
}
