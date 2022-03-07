/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1Java;


import java.util.Scanner;
public class CalculoArea {
    public static void main(String[] args) {
        double dian = 0.0,r = 0.0;
        final double pi = 3.14;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o diamêtro do círculo:");
        dian = in.nextFloat();
        
        r = dian/2;
        
        System.out.println("A area do círculo é igual a : " + (pi*(r*r)) + "cm");
    }
}
