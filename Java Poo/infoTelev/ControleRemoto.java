import java.util.Scanner;
public class ControleRemoto {
    public static Televisao telev = new Televisao();
    int botaoauv = 1;
    int botaodiv = 1;
    int botaoauc = 1;
    int botaodivc = 1;
    int trcaind;
    
    public int AumentarVol(int botaoauv,int vols){
       vols = vols + this.botaoauv;
       
       return vols;
    }
    
    public int DiminuirVol(int botaodiv,int vols){
       vols = vols - this.botaodiv;
       
       return vols;
    }
    
    public int AumentarCan(int botaoauc,int can){
        can = can + this.botaoauc;
        
        return can;
    }
    
    public int DiminuirCan(int botaodivc,int can){
        can = can  - this.botaodivc;
        
        return can;
    }
    
    public int TrocarCan(int receb){
        return receb;
    }
    
    
    public void MostrarSomeC(){
        System.out.printf("O som da televisão está em %d e o canal está em %d ! \n",telev.voldsom,telev.canal);
    }
    public static void main(String[] args) {
        int recebc;
        telev.voldsom = 0;
        telev.canal = 0;
        
        Scanner in = new Scanner(System.in);
        
        ControleRemoto controle = new ControleRemoto();
        
        telev.voldsom = controle.AumentarVol(controle.botaoauv,telev.voldsom);
        
        System.out.println("O volume da televisão é " + telev.voldsom);
        
        controle.MostrarSomeC();
        
        System.out.println("Digite o canal desejado:");
        recebc = in.nextInt();
        
        telev.canal = controle.TrocarCan(recebc);
        
        System.out.println("O canal da televisão é " + telev.canal);
        
    }
}
