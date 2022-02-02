import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        //Instanciação do nu
        Scanner in = new Scanner(System.in);
        
        //Entrada do programa Calculadora 2.0
        System.out.println("=== Digite uma das Opções abaixo ===");
        
        //Tabela com opções que podem ser escolhidas
        System.out.println("Adição(1)");
        System.out.println("Subtração(2)");
        System.out.println("Multiplicação(3)");
        System.out.println("Divisão(4)");
        
        // Entrada da opcao
        int op = in.nextInt();
        
        //Entrada da váriavel num1
        System.out.println("Insira o primeiro número:");
        double num1 = in.nextDouble();
        
        //Entrada da váriavel num2
        System.out.println("Insira o segundo número:");
        double num2 = in.nextDouble();
        
        //Condições aninhadas correspondente a cada operação
        if(op == 1){
            System.out.println("A soma dos dois números é igual a: " + (num1 + num2));
        }else{
            if(op == 2){
                System.out.println("A subtração dos dois números é igual a: " + (num1 - num2));
            }else{
                if(op == 3){
                    System.out.println("A multiplicação dos dois números é igual a: " + (num1 * num2));
                }else{
                    if(op == 4){
                        System.out.println("A divisão dos dois números é igual a: " + (num1/num2));
                    }else{
                        System.out.println("Opção inválida!");
                    }
                }
            }
        }
    }         
}
