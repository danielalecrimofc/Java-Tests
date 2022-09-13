import java.util.List;
import java.util.ArrayList;

public class Departamento {
    private int id_departamento;
    public String descricao;
    public List<Pessoa> pessoas;
    
    public Departamento(int id_departamento){
        this.id_departamento = id_departamento;
    }

    public int getId_departamento() {
        return id_departamento;
    }
    
    
    
}
