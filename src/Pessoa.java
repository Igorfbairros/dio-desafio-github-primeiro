public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;


    public enum TipoPessoa{FISICA, JURIDICA}
    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;

    public String getDocument(){
        return documento;
    }
    
    public void setDocumento(String documento, Pessoa.TipoPessoa tipoPessoa){
        if( documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser Nullo ou Vazio");
        }
        if(documento.length() == TAMANHO_CPF){

         setDocumento(documento, tipo = TipoPessoa.FISICA); 


        }
        if(documento.length()== TAMANHO_CNPJ){
              setDocumento(documento, TipoPessoa.JURIDICA);

                }
        
        else{
                throw new RuntimeException("Documento invalido para pessoa Juridica ou Fisica");
            }

            private void setDocumento(String documento, TipoPessoa tipo){
                this.documento = documento;
                this.tipo = tipo;
            }
            
            TipoPessoa getTipo(){
                return tipo;
            }
        }
    }
