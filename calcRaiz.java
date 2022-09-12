import java.util.Scanner;
public class calcRaiz {
    public static void main(String[] args) {
        int delta,a,b,c,x1,x2;
  
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor de a:");
        a = in.nextInt();
        
        System.out.println("Digite o valor de b:");
        b = in.nextInt();
        
        System.out.println("Digite o valor de c:");
        c = in.nextInt();
        
        if(a == 0){
            System.out.println("Não é equação do segundo grau!");
        }
        
        
        delta = (int)(Math.pow(Double.parseDouble(String.valueOf(b)),2)) - 4 * a * c;
        
        if(delta < 0){
            System.out.println("Não existe raiz real!");
        }else{
            if(delta == 0){
                x1 = (int)(-b + Math.sqrt(delta))/(2*a);
                System.out.println("Raíz Única , X1 e X2 são = " + x1);
            }else{
                x1 = (int)(-b + Math.sqrt(delta))/(2*a);
                x2 = (int)(-b - Math.sqrt(delta))/(2*a);
                System.out.printf("Raízes Distintas , x1 = %d e x2 = %d",x1,x2);
            }
        }
    }
}
