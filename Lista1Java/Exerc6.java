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
public class Exerc6 {
    public static void main(String[] args) {
        double delta,a,b,c,x1,x2;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("==== Cálculo raizes de uma equação ====");
        
        System.out.println("Digite o valor de a:");
        a = in.nextFloat();
        
        if(a == 0){
            System.out.println("Não é equação do 2º grau!\n" + ("Reinicie o programa"));
            System.exit(1);
        }
        
        System.out.println("Digite o valor de b:");
        b = in.nextFloat();
        
        System.out.println("Digite o valor de c:");
        c = in.nextFloat();
        
        delta = (Math.pow(b,2)) - (4*a*c);
        
        if(delta < 0){
            System.out.println("Não existe raiz");
        }else{
            if(delta == 0){
                x1 = (-(b) + (Math.sqrt(delta)))/(2*a);
                x2 = (-(b) - (Math.sqrt(delta)))/(2*a);
                System.out.println(" Raiz única = " + x1 + " pois x1:" + x1 + " é igual a x2:" + x2) ;
            }else{
                if(delta > 0){
                    x1 = (-(b) + (Math.sqrt(delta)))/(2*a);
                    x2 = (-(b) - (Math.sqrt(delta)))/(2*a);
                    System.out.println("Raiz de x1 = " + x1 + " e Raiz de x2 = " + x2);
                }
            }
        }
    }
}
