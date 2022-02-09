import java.util.Scanner;

public class myTri3{
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

            String recebL = ((A<BC) && (B<AC) && (C<AB)) ? "Formam um triângulo" : "Não formam um triângulo";
            System.out.println("Chegamos a conclusão de que os valores colocados : " + recebL);
    }
}