
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int id_pessoa_fisica, String nome) {
        super(id_pessoa_fisica);
        setNome(nome);
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
}
    
