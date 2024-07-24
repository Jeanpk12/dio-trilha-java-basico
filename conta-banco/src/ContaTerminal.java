import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, Digite o Nome do Cliente");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o valor do primeiro depósito");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + (saldo) + " já disponível para saque.");
    }
}
