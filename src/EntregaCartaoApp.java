import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        endereco.cep = "00000";
        // Dados os Enderecos   


        Cliente cliente = new  Cliente();
        // Dados do Cliente
        
        try{
            cliente.adicionarEndereco(endereco);
            System.out.println("Endereço Adicionado com sucesso !");
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }

    }
    
}
