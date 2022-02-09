import java.util.Scanner;

public class myMedia {
    public static void main(String[] args) {
        double primNota,seconNota,media;
        
        Scanner recN = new Scanner(System.in);
        
        System.out.println("==== Cálculo de Média ====");
        
        System.out.println("Digite a primeira nota:");
        primNota = recN.nextFloat();
        
        System.out.println("Digite a segunda nota:");
        seconNota = recN.nextFloat();
        
        media = (primNota + seconNota)/2;
        
        if(media >= 7.0){
            System.out.printf("Parábens você passou !,sua média foi %.2f",media);
        }else{
            if(media > 4.0 && media < 5.0){
                System.out.printf("Infelizmente você não passou,sua média foi %.2f",media);
            }else{
                if(media>= 4.0 || media<7.0){
                    if(media>=5.0){
                        System.out.printf("Aprovado na final,sua média foi %.2f",media);
                    
                    }else{
                        System.out.printf("Reprovaod na final,sua média foi %.2f",media);
                    }
                }
            }
        }  
    }
}