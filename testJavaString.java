import java.util.Scanner;
public class testJavaString {
    public static void main(String[] args) {
        String var = "1";
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor para o final:");
        int fim = in.nextInt();
        
        for(int i = 1;i<fim + 1;i++){
            System.out.println(var);
            var = var.concat(String.valueOf(i + 1));
        }
    }
}
