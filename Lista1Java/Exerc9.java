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
public class Exerc9 {
    public static void main(String[] args) {
        int n = 0,anterior = 0,atual = 1,proximo = 1;
        int i;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Quantos termos quer ver ?");
        n = in.nextInt();
        for(i = 0;i<n;i++){
            while(i == 0){
                System.out.println(i);
                i++;
            }
            
            System.out.println(proximo);
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
   
        }
   }
}
