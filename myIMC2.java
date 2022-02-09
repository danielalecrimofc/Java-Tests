import java.util.Scanner;
public class myIMC2 {
    public static void main(String[] args) {
        double pesIHom,pesIMulh,alTura;
        String oP;
        
        Scanner recalT = new Scanner(System.in);
        Scanner recoP = new Scanner(System.in);
        
        System.out.println("==== Cálculo do peso ideal ====");
        System.out.println("Opção(M) == Peso ideal para Homens");
        System.out.println("Opção(F) == Peso ideal para Mulheres");
        System.out.println("==== Digite uma opção abaixo ====:");
        oP = recoP.nextLine().toUpperCase();
        
        System.out.println("Digite sua altura e será calculado seu peso ideal:");
        alTura = recalT.nextFloat();
        
        switch(oP){
            case "M":
                pesIHom = (72.7 * alTura) - 58;
                System.out.printf("O peso ideal para a sua altura é:%.2f KG",pesIHom);
                break;
            case "F":
                pesIMulh = (62.1 * alTura) - 44.7;
                System.out.printf("O peso ideal para a sua altura é:%.2f KG",pesIMulh);
                break;
            default:
                System.out.println("Opção inválida,escolha outra opção!!!");

        }
    }
}
