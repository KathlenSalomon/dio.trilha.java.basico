import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome ?");
        String nome = scanner.next();

        System.out.println("Qual é o seu sobrenome ?");
        String sobrenome = scanner.next();

        System.out.println("Qual é sua idade ?");
        int idade = scanner.nextInt();

        System.out.println("Qual é a sua altura ?");
        double altura = scanner.nextDouble();



       

        System.out.println("Ola, me chamo" +" " + nome + " " + sobrenome);
        System.out.println("Tenho" + " " + idade + "anos");
        System.out.println("Minha altura é"+ " " + altura + "cm");
       



    }
}
