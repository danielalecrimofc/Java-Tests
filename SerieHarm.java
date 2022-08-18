import java.util.Scanner;
public class SerieHar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float serieHarm = 0;
        int n,i;
        
        System.out.println("Digite a repetição da serie:");
        n = input.nextInt();
        
        for ( i = 1; i < n; i++) {
            serieHarm = serieHarm + (float)1/i;
        }
        
        System.out.println("O valor da serie harmônica é : " + serieHarm);
        
        
    }
}
