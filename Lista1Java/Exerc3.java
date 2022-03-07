/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1Java;

import java.util.Scanner;
public class Exerc3 {
    public static void main(String[] args) {
        int hrsTrab;
        double precH,salBr,impR,inSS,sindC;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("==== Reajuste Salarial ====");
        System.out.println("Digite abaixo quantas horas você trabalha por dia"
                 +" e o quanto você ganha por hora:");
        hrsTrab = in.nextInt();
        precH = in.nextFloat();
        
        hrsTrab = 23 * hrsTrab;
        
        salBr = precH * hrsTrab;
        
        System.out.println("Seu salário bruto é:" + salBr);
        
        // Cálculos descontos//
        impR = salBr * 0.11;
                
        inSS = salBr * 0.08;
                
        sindC = salBr * 0.05;
        
        System.out.printf("Foram descontados R$%.2f do imposto de renda,R$%.2f do INSS e R$%.2f do Sindicato",impR,inSS,sindC);
        
        // Salário liquído
        System.out.println("Seu salário liquido é:R$" + (salBr - (impR + inSS + sindC)) + " e foram descontados no total:R$" + (impR + inSS + sindC));
    }
}
