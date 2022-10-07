import java.util.ArrayList;
import java.util.*;
public class testeJavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numer = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor para o final:");
        int fim = in.nextInt();
        for(int i = 1;i<fim+1;i++){
            numer.add(i);
            System.out.println(numer);
                
        }
        
    }
}
