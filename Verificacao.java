
import java.util.Scanner;

public class Verificacao {
    public static void main (String[] args){
        //instanciando o objeto num da classe Verificação
        Scanner num = new Scanner(System.in);
        
        //Declarando a variável num do tipo inteiro
        int num1;
        
        //Saída solicitando a entrada de um número
        System.out.println("Digite um número:");
        
        //Entrada da variável num1
        num1 = num.nextInt();
        
        /* Condição simples if onde estou avaliando se a variável num1 é igual
        ao número que estou comparando
        */
        if(num1 == 10){
            System.out.println("Condição cerdadeira!");
         }
        else
            System.out.println("Condição falsa!");
    }
}
