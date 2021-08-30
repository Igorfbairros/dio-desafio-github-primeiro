import java.util.ArrayList;
import java.util.List;

public class Cliente{

    public Integer codigo;
    public String nome;
    public String cpf;

    private List<Endereco> enderecos;

    public void adicionarEndereco(Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("Endereço não pode ser Null");
        }
        if(endereco.cep == null){
            throw new NullPointerException("Endereço não pode ser Null");
        }

    }

    public List<Endereco> getEnderecos(){
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }

        return enderecos;

    }

    
}
    