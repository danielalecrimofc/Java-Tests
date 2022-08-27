public class Personagem {
    String nome;
    int idade;
    
    public Personagem(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    } 
    
    public Personagem(){
        this("José",22);
    }
    
    public static void main(String[] args) {
        Personagem jose = new Personagem();
        
        System.out.println("O nome do meu personagem é : " + jose.nome);
    }
}
