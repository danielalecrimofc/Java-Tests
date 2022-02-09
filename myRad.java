import java.util.Scanner;

public class myRad {
    public static void main(String[] args) {
        double G,R;
        final double PI = 3.1415;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um valor para o Ângulo:");
        G = in.nextFloat();
        
        R = G*(PI/180);
        
        System.out.printf("O valor em radianos é : %.2f Radianos ",R);
        
        
    }
}
