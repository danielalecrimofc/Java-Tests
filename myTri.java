import java.util.Scanner;

public class myTri {
    public static void main(String[] args) {
        int A,B,C,BC,AC,AB;
        
        Scanner trian = new Scanner(System.in);
        
        System.out.println("==== Verificando a existência de um triângulo ====");
        
        System.out.println("Digite um valor para o lado A:");
        A = trian.nextInt();
        
        System.out.println("Digite um valor para o lado A:");
        B = trian.nextInt();
        
        System.out.println("Digite um valor para o lado A:");
        C = trian.nextInt();
        //Atribuição da soma lados B e C
        BC = B + C;
        //Atribuição da soma lados A e C
        AC = A + C;
        //Atribuição da soma lados A e B
        AB = A + B;
        
        if((A<BC) && (B<AC) && (C<AB)){
            System.out.println("É um triângulo");
        }else{
            System.out.println("Não é um triângulo");
        }
        
        
   }
}
