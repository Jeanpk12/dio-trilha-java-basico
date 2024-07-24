import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 250.30;
        System.out.println("Digite o valor que deseja sacar:");
        double valorSaque = scanner.nextDouble();

        //Estrutura condicional if/else
        if (saldo < valorSaque) {
            System.out.println(
                    "Não foi possível realizar o saque. Entre em contato com a nossa central de atendimento: (15) 99699-8009");
        } else {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo restante na conta: " + saldo);
        }
    }
}
