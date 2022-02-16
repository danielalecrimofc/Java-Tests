import java.util.Scanner;
public class myIMC {
    static double  IMC(double pes,double alt){
        double imc;
        
        imc = pes /(alt * alt);
        
        return imc;
    }
    
    static double p_Ideal(double alt,String s){
        double peso_ideal;
        
        if (s.equals("M")){
            peso_ideal = (62.1*alt) - 44.7;
            return peso_ideal;
        }else{
            if (s.equals("H")){
                peso_ideal =  (72.7*alt) - 58;
                return peso_ideal;
            }
         }           
      }
    
    static void TELA(){
        System.out.println("==== Calcúlo IMC e Peso Ideal ====");
        System.out.println("==== Digite (1) para IMC ====");
        System.out.println("==== Digite (2) para Peso Ideal ====");
        System.out.println("==== Digite (3) para IMC e Peso Ideal ====");
        System.out.println("==== Digite qualquer outro número para sair ====");
    }
    
    public static void main(String[] args) {
        double peso,altura,recebimc,recebpeso_ideal;
        int op;
        String sexo;
        
        Scanner in = new Scanner(System.in);
        
        TELA();
        
        System.out.println("Digite uma opção acima:");
        op = in.nextInt();
        
        System.out.println("Qual é o seu sexo ?");
        sexo = in.next();
        
        System.out.println("Qual é a sua altura ?");
        altura = in.nextFloat();
        
        System.out.println("Qual é o seu peso ?");
        peso = in.nextFloat();
        
        if(op == 1){
            recebimc = IMC(peso,altura);
            
            System.out.printf("Seu IMC é : %.2f",recebimc); 
           
           }else{
                if(op==2){
                    recebpeso_ideal = p_Ideal(altura,sexo);
                    System.out.printf("Seu peso ideal é %.2f",recebpeso_ideal);
                }else{
                    if(op==3){
                        recebimc = IMC(peso,altura);
                        recebpeso_ideal = p_Ideal(altura,sexo);
                        
                        System.out.printf("Seu IMC é %.2f e seu peso ideal é %.2f",
                        recebimc,recebpeso_ideal);
                        
                    }else{
                        int i = 0;
                        while(i<1){
                            System.out.println("Opção Inválida");
                            i++;
                            break;
                  }
               }
          }
   
     }
  }
}
