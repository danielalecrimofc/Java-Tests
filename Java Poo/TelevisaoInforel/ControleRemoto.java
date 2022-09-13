import java.util.Scanner;
public class ControleRemoto {
    int modvol;
    int modcan;
   
    
    void aumentarVolume(Televisao televisao){
        this.modvol += 1;
        
        televisao.volume = this.modvol;
    }
    
    void diminuirVolume(Televisao televisao){
        this.modvol -= 1;
        
        televisao.volume = this.modvol;
    }
    
    void aumentarCanal(Televisao televisao){
        this.modcan += 1;
        televisao.canal = this.modcan;
    }
    
    void diminuirCanal(Televisao televisao){
        this.modcan -= 1;
        televisao.canal = this.modcan;
    }
    
    void trocarCanal(Televisao televisao,int canaldesejado){
        this.modcan = canaldesejado;
        televisao.canal = this.modcan;
    }
    
    void mostarVoleCanal(Televisao televisao){
        System.out.println("O canal atual é o canal " + televisao.canal + " e o volume de som atual é o  volume " + televisao.volume );
    }
    
    public static void main(String[] args) {
        String cond = "on";
        String op;
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto();

        Scanner in = new Scanner(System.in);
        
        
        while(cond.equals("on")){
            menu();
            System.out.println("Digite a opção desejada:");
            op = in.nextLine();
            switch (op) {
                case "+":
                    controle.aumentarVolume(tv);
                    controle.mostarVoleCanal(tv);
                    break;
                case "-":
                    controle.diminuirVolume(tv);
                    controle.mostarVoleCanal(tv);
                case "c":
                    controle.aumentarCanal(tv);
                    controle.mostarVoleCanal(tv);
                    break;
                case "b":
                    controle.diminuirCanal(tv);
                    controle.mostarVoleCanal(tv);
                    break;
                case "e":
                    cond = "e";
                    System.out.println("Saindo");
                    controle.mostarVoleCanal(tv);
                    break;
            }
        }
        
       
        
    }
    public static void menu(){
        System.out.println("//Menu//");
        System.out.println("//Aumentar Volume(+)//");
        System.out.println("//Aumentar Volume(-)//");
        System.out.println("//Aumentar Canal(c)//");
        System.out.println("//Diminuir Canal(b)//");
        System.out.println("// Sair (e)//");
    }
}
