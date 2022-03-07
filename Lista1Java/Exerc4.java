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
public class Exerc4 {
    static void mostrarCedulas(){
        System.out.println("==== Cédulas Disponíveis ====\n" +
         "   === R$50,00 ===   \n" + "   === R$10,00 ===   \n" + "   === R$5,00 ===   \n" + "   === R$1,00 ===   \n" );
    }
    public static void main(String[] args) {
        int valor = 0,recebv = 0,valordm5 = 0,valormod = 0,parteint = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("==== Distribuição caixa eletrônico ====");
         mostrarCedulas();
        try{
            System.out.println("Quanto quer sacar?");
            valor = in.nextInt();
        }catch(Exception err){
            System.err.println("Ocorreu o seguinte erro:" + err);
            System.exit(1);
        }
         
         if(valor<50){
             if(valor == 10 && valor % 10 == 0){
                 System.out.println("Você receberá:" + (valor/10) + "notas de R$10,00");
                 
             }else{
                 if(valor > 10 && valor % 10 != 0){
                     recebv = valor % 10;
                     if(recebv < 5){
                         System.out.println("Você receberá:" + (valor/10) + "notas de R$10,00");
                         System.out.println("Você receberá:" + recebv + "notas de R$1,00");
                     }
                     if(recebv > 5){
                         System.out.println("Você receberá:" + (valor/10) + "notas de R$10,00");
                         System.out.println("Você receberá:"  + "1 nota de R$5,00 e " + (recebv - 5) + " notas de R$1,00");
                     }
                     if(recebv == 5){
                         System.out.println("Você receberá:" + (valor/10) + "notas de R$10,00");
                         System.out.println("Você receberá:"  + "1 nota de R$5,00");
                     }
                 }else{
                     if(valor < 10){
                        if(valor < 5){
                            System.out.println("Você receberá:" + valor + "notas de R$1,00");
                        }
                        if(valor > 5){
                            System.out.println("Você receberá:"  + "1 nota de R$5,00 e" + (valor - 5) + " notas de R$1,00");
                        }
                        if(valor == 5){
                            System.out.println("Você receberá:"  + "1 nota de R$5,00");
                     }
                 }
             }
         }
        
    }else{
          if(valor >= 50){
              if(valor == 50){
                  System.out.println("Você receberá 1 nota de R$50,00!");
                  
              }else{
                  if(valor > 50){
                      if(valor % 50 == 0){
                          System.out.println("Você receberá " + (valor/50) + " de R$50,00!");
                      }else{
                          if(valor % 50 != 0){
                              if(valor % 10 == 0){
                                 valormod = valor / 10;
                                 if(valormod % 10 >= 1 && valormod % 10 <= 4){
                                     valordm5 = valor/50;
                                     parteint = Math.round(valordm5);
                                     
                                 }
                              }
                          }
                      }
                          
                  }
              }
          }
         }
   }
}

