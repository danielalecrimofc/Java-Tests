/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1Java;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class Exerc11 {
    static void tela(){
        System.out.println("===== Calculadora =====\n" + "==== OP(1) Adição ====\n" + 
                    "==== OP(2) Subtração ====\n" + "==== OP(3) Multiplicação ====\n" + "==== OP(4) Divisão ====\n"
           + "==== OP(5) Saída ====\n");
    }
    public static void main(String[] args) {
        double num1,num2;
        int n = 0,op = 0;
        
        
        Scanner in = new Scanner(System.in);
        
        while(n<10000){
            tela();
            System.out.println("Digite a opção:");
            op = in.nextInt();
            
            if(op == 5){
                System.out.println("Saindo...");
                break;
            }else{
                if(op>5 || op<0){
                    System.out.println("Opção Inválida!");
                    break;
                }
            }
            
            System.out.println("Digite o primeiro número:");
            num1 = in.nextFloat();
            
            System.out.println("Digite o primeiro número:");
            num2 = in.nextFloat();
            
                if(op < 5 && op > 0){
                    if(op == 1){
                        System.out.println("A soma dos números é igual a " + (num1 + num2 ));
                    }else{
                        if(op == 2){
                            System.out.println("A subtração dos números é igual a "+ (num1 - num2));
                        }else{
                            if(op == 3){
                                System.out.println("A multiplicação dos números é igual a "+ (num1 * num2 ));
                            }else{
                                if(op == 4){
                                    System.out.println("A divisão dos números é igual a "+ (num1 / num2 ));
                                }
                            }
                        }
                    }
                }
            
        }
        
    }
}
