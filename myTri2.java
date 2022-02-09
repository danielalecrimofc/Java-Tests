import java.util.Scanner;

public class myTri2{
    public static void main(String[] args) {
        // Variáveis tipo Inteiro
        int A,B,C,BC,AC,AB,result1,result2,result3;
        //Variáveis tipo String
        String primL = "",segL = "",terL = "";
        // Instânciação do objeto trian da classe Scanner
        Scanner trian = new Scanner(System.in);
        
        System.out.println("==== Verificando a existência de um triângulo ====");
        
        System.out.println("Digite um valor para o lado A:");
        A = trian.nextInt();
        
        System.out.println("Digite um valor para o lado B:");
        B = trian.nextInt();
        
        System.out.println("Digite um valor para o lado C:");
        C = trian.nextInt();
        
        //Atribuição da soma lados B e C
        BC = B + C;
        //Atribuição da soma lados A e C
        AC = A + C;
        //Atribuição da soma lados A e B
        AB = A + B;
        
        if(BC > A){
            System.out.println("Primeiro lado ok!");
            primL = "Primeiro lado ok";
        }
        else{
            System.out.println("Lado desigual");
                }
            if(AC > B){
               System.out.println("Segundo lado ok!");
               segL = "Segundo lado ok";
            }
        else{
            System.out.println("Lado desigual");
                }   
             if (AB > C){
                System.out.println("Terceiro lado ok !");
                terL = "Terceiro lado ok";
                }else{
                    System.out.println("Lado desigual");
                }
        // Metódo compare recebendo
        result1 = primL.compareTo(primL);
        
        result2 = segL.compareTo(segL);
      
        result3 = terL.compareTo(terL);
        
        /* Condicional verificando o que as varia´veis "result"
        receberam,se todas derem zero então é um triângulo,se derem
        diferente de zero não é um triângulo
        */
        if ((result1 == 0) && (result2 == 0) && (result3 == 0)){
            System.out.println("É um triângulo!");
        }else{
            System.out.println("Não é um triângulo!");
        }
        

   }
}