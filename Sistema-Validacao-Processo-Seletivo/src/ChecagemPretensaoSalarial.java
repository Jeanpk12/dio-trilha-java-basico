import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChecagemPretensaoSalarial {
    public static void main(String[] args) {
        

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Rodrigo", "Tamires", "Miguel", "Jean", "Tomas", "João", "Vicente", "Paula", "Margarida"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor para o salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Rodrigo", "Tamires", "Miguel"};
        System.out.println("Imprimindo lista de candidatos:");
        
        for (String candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    static void analisarPretensaoSalario(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else
            System.out.println("Aguardar resultado de demais candidatos");
    }
}
