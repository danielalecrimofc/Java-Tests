
import java.util.Calendar;
public class Pessoa {
  
    String nome;
    int anoNascimento;
    double altura;
    
    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }
    int calcularIdade() {
        int idade;
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        idade = anoAtual - anoNascimento;
        return idade;
    }
    public static void main(String[] args) {
        int idade;
        Pessoa Daniel = new Pessoa();
        
        Daniel.nome = "Daniel";
        Daniel.anoNascimento = 1999;
        Daniel.altura = 1.83;
     
        Daniel.mostrarDados();
        
        idade = Daniel.calcularIdade();
        
        System.out.println( Daniel.nome + " tem atualmente " + idade + " anos !");
    }
    
}
    
