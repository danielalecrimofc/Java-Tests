import java.util.Scanner;
public class testjavaString {
    public static void main(String[] args) {
        String recev = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para o final da iteração:");
        int fim = scan.nextInt();
        
        for(int i = 1;i<fim + 1;i++){
            int numero_vez = i;
            if(numero_vez > 1){
               int receb_numv = numero_vez;
               String letranumv = String.valueOf(receb_numv);
               for(int ver = 0;ver<receb_numv;ver++){
                  recev = recev.concat(letranumv);
                  if(ver == receb_numv - 1){
                      System.out.println(recev);
                      recev = recev.replace(recev,"");
                  }
               }
             }else{
                    System.out.println(i);
        }
     }
  }
}
