public class App {
    public static void main(String[] args) throws Exception {
        double peso = 135;
        double altura = 1.83;
        double imc = calcularIMC(peso, altura);
        
        if (imc < 16.9) {
            System.out.println("Muito abaixo do peso");
        } else if (imc < 18.4) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Acima do peso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }
    }

    public static double calcularIMC(double peso, double altura){
        return peso / (altura * altura);
    }
}
