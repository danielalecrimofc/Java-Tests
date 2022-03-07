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
public class Exerc5 {
    public static void main(String[] args) {
        double valSal,empres,prest,porc;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("==== Cálculo Empréstimo ====");
        System.out.println("Digite o valor do seu salário:");
        valSal = in.nextFloat();
        porc = valSal * 0.2;
        
        System.out.println("Digite o valor do empréstimo:");
        empres = in.nextFloat();
        
        prest = empres/12;
        
        if(prest > porc){
            System.out.println("Empréstimo não condedido!!");
        }else{
            if(prest < porc){
                System.out.println("Empréstimo concedido!!");
            }
        }
        
        
        
        
    }
}
