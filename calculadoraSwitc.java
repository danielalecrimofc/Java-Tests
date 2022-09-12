import java.util.Scanner;
public class Calculad {
    public static void optMenu(){
        System.out.println("Adição (Opção 1) \t" 
                         + "Subtração (Opção 2) \t"
                         + "Multiplicação (Opção 3) \t"
                         + "Divisão (Opção 4) \t"
                         + "Sair (Opção 0) \t");
    }
    public static void main(String[] args) {
        int num1,num2,opt = -1;
        int soma,sub,div,mult;
        Scanner in = new Scanner(System.in);
        while(opt != 0){
            optMenu();
            System.out.println("Digite o número da operação desejada:");
            opt = in.nextInt();
            if(opt == 0 ){
                System.err.println("Saindo...");
            }else{
                System.out.println("Digite o valor do primeiro número:");
                num1 = in.nextInt();
                System.out.println("Digite o valor do segundo número:");
                num2 = in.nextInt();
                switch (opt) {
                    case 1:
                        soma = num1 + num2;
                        System.out.println("Sua soma deu  = " + soma);
                        break;
                        
                    case 2:
                        sub = num1 - num2;
                        System.out.println("Sua subtração deu  = " + sub);
                        break;
                    case 3:
                        mult = num1 * num2;
                        System.out.println("Sua multiplicação deu  = " + mult);
                        break;
                        
                    case 4:
                        div = num1 / num2;
                        System.out.println("Sua divisão deu  = " + div);
                        break;
                }
            }
        }
        
    }
}
