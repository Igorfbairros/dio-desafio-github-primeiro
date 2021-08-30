import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        // Dados os Enderecos   


        Cliente cliente = new  Cliente();
        // Dados do Cliente
        if(cliente.enderecos == null){
            cliente.enderecos = new ArrayList<Endereco>();
        }

        cliente.enderecos.add(endereco);
    }
    
}
