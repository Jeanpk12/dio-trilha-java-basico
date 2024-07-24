import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.println("Digite a nota do aluno: ");
        int notaAluno = scanner.nextInt();

        if (notaAluno < 5) {
            System.out.println("O aluno " + nomeAluno + " foi reprovado");
        } else if(notaAluno < 7){
            System.out.println("O aluno " + nomeAluno + " está de recuperação");
        } else {
            System.out.println("O aluno " + nomeAluno + " foi aprovado!");
        }
    }
}

// Fluxos condicionais compostos são aqueles que possibilitam a exexução de multiplos blocos de código à depender das condições estabelecidas