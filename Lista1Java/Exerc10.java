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
public class Exerc10 {
    public static void main(String[] args) {
        int num = 0,numer = 1,recebfat = 1,recebnum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("=== Calcúlo fatorial ====");
        System.out.println("Digite um número para calcular o seu fatorial:");
        num = in.nextInt();
        while(num > 0){
            recebfat *= (num--);
        }
        
        System.out.println("O calcúlo fatorial é igual a:" + recebfat);
    }
}
