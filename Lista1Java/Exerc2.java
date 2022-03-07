/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1Java;


import java.util.Scanner;

public class Exerc2 {
 
    public static void main(String[] args) {
        double num;
        Scanner in = new Scanner(System.in);
        System.out.println("====Caclulo Raiz e Quadrado de um número ====\n" + "==== Digite um número positivo ====\n");
        num = in.nextFloat();
        
        if(num < 0){
            System.out.println("O número não pode ser negativo!");
        }else{
            if(num>0){
                System.out.printf("O quadrado do número é :%.1f e sua raiz é:%.1f ",Math.pow(num,2),Math.sqrt(num));
            }
        }
        
        
}
}