public class Endereco{

    public enum tipoEndereco{RESIDENCIAL, ENTREGA, TRABALHO} // Was Created becouse List<Endereco> in Client

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;
}