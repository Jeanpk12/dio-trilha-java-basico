public class App {
    public static void main(String[] args) throws Exception {
        
        int numero1 = 10; // O simbolo "=" é chamado de operador de atribuição
        int numero2 = 11;
        
        // Operadores
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int divisao = numero1 / numero2;
        int multiplicacao = numero1 * numero2;
        int modulo = numero1 % numero2;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da divisão é: " + divisao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado do módulo é: " + modulo);

        //Incrementador e declementador
        numero1++; // incrementa 1 a variável numero1
        System.out.println(numero1);
        numero1--; // Decrementa 1 a variável numero1
        System.out.println(numero1);
        
        //Operador ternário
        // Basicamente, o operador ternário serve como uma sintaxe mais simples para a estrutura condicional if/else
        String resultado = (numero1 > numero2) ? "É maior" : "É menor";
        System.out.println(resultado);

    }
}
