import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public String numCartao;
    
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
    