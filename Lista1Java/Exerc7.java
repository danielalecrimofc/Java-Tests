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
public class Exerc7 {
    public static void main(String[] args) {
        double nota1,nota2,nfinal,media;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("==== Cálculo Média ====");
        
        System.out.println("Digite a primeira nota:");
        nota1 = in.nextFloat();
        
        System.out.println("Digite a segunda nota:");
        nota2 = in.nextFloat();
        
        media = (nota1 + nota2)/2;
        
        if(media >= 7.0){
            System.out.println("Aprovado");
        }else{
            if(media < 4.0){
                System.out.println("Reprovado");
            }else{
                if(media >= 4.0 && media < 7.0){
                    System.out.println("Ficou de final!");
                    
                    System.out.println("Qual foi a nota final:");
                    nfinal = in.nextFloat();
                    
                    media = (media + nfinal)/2;
                    
                    if(media >= 7.0){
                        System.out.println("Aprovado na final");
                    }else{
                        System.out.println("Reprovado na final");
                    }
                }
            }
        }
        
        
    }
}
