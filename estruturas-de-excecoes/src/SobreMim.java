import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
        public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();
        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
        } catch (InputMismatchException e) {
            System.out.println("O campo idade e altura precisam ser numéricos");
        }
    }
}
