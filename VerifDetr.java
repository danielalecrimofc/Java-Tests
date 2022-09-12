import java.util.Scanner;
    public class Trein {
    public static void main(String[] args) {
      int idade;
      boolean temcarta = false;
      Scanner in = new Scanner(System.in);
      System.out.println("Digite a idade do usuário");
      idade = in.nextInt();
      
      if(idade >= 18){
        System.out.println("O Usuário tem habilitação ?");
        temcarta = in.nextBoolean();
        if(temcarta == true){
            System.out.println(" Veículo Liberado");
        }else{
            System.out.println("Veículo retido a espera de um habilitado !");
        }
      
       }else{
          System.out.println("Veículo retido,o jovem e o responsável devem ser conduzidos para a delegacia !");
      }
        
    }
}
