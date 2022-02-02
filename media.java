import java.util.Scanner;

public class media {
    public static void main (String[] args){
        //Instanciação do objeto in da Classe media
        Scanner in = new Scanner(System.in);
        
        //Declaração das variáveis do tipo double
        double nota1,nota2,nota3,media_nota;
        
        //Saída solicitando a primeira nota do aluno
        System.out.println("Insira a primeira nota:");
        nota1 = in.nextDouble();
        
        //Saída solicitando a primeira nota do aluno
        System.out.println("Insira a segunda nota:");
        nota2 = in.nextDouble();
        
        //Saída solicitando a primeira nota do aluno
        System.out.println("Insira a terceira nota:");
        nota3 = in.nextDouble();

        //Atribução da media na variável 'media_nota'
        media_nota = (nota1 + nota2 + nota3)/3;
        
        /* Estrutura condicional if comparando a media do aluno
        com a condição proposta dentro do if */
        if(media_nota >= 5){
            System.out.println("Passou!,sua média é " + media_nota);
        }
        else{
            System.out.println("Não passou!,sua média é " + media_nota);   
        } 
    }
}

