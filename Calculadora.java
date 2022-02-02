import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        // instanciando o objeto in da classe Calculadora
        Scanner in = new Scanner(System.in);

        //Saída mostrando a entrada do programa
        System.out.println("==== Calculadora ====");

        //Declaração das variáveis dentro do programa
        float num1,num2,soma,subtracao,divisao,multiplicacao;
        
        //Saída solicitando o primeiro número que será usado
        System.out.println("Insira um número:");
        //Atribuição de num1
        num1 = in.nextFloat();
        
        //Saída solicitando o primeiro número que será usado
        System.out.println("Insira outro número");
        //Atribuição de num1
        num2 = in.nextFloat();
        
        //Atribuição da soma entre num1 e num2
        soma = num1 + num2;
        //Saída com o resultado da soma
        System.out.println("A soma é igual a " + soma);
        
        //Atribuição da subtração entre num1 e num2
        subtracao = num1 - num2;
        //Saída com o resultado da subtração
        System.out.println("A subtração é igual a " + subtracao);
        
        //Atribuição da multiplicação entre num1 e num2
        multiplicacao = num1 * num2;
        //Saída com o resultado da multiplicação
        System.out.println("A multiplicação é igual a " + multiplicacao);
        
        //Atribuição da divisão entre num1 e num2
        divisao = num1 / num2;
        //Saída com o resultado da divisão
        System.out.println("A divisão é igual a " + divisao);
        
        
    }
    
}
