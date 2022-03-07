/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1Java;

import java.util.Scanner;
public class Exerc8 {
    public static void main(String[] args) {
        int num = 1,cont = 0,sq = 0,qs = 0;
        
        while(cont<10){
            sq += (Math.pow(num,2));
            qs += num;
            num++;
            cont++;
         
        }
        
        System.out.println("A diferença entre a soma dos quadrados e o quadrado das somas" +
          "dos 10 primeiros números naturais é:" + ((Math.pow(qs,2)) - sq)  );
        
        System.out.println(qs);
        System.out.println(sq);
    }
}
