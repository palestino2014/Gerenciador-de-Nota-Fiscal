/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

/**
 *
 * @author gustavo
 */

public abstract class pessoa {

    //   protected String nome;
    //   protected Polimorfica(String Nome){
    //   this.nome = nome;
    //   }
       protected String pessoa;
       protected String nomeRazaoSocial;
       protected String nomeFantasia;
       protected int cep;
       protected String endereco;
       protected String lougradouro;
       protected int numero;
       protected String complemento;
       protected String estado;
       protected String municipio ;
       protected String bairro;
       protected String cidade;
       protected String cnpj;
       protected String cpf;
       protected String cnpjcpf;
       protected String Nome1;
       protected String getCnpjCpf;
          
      public abstract String getNome1();
      public abstract String getCpf();
      public abstract String getCnpj();
      public abstract String getCnpjCpf();
       
        public String getCpf() {
        return cpf;
        }
        public String getCnpj() {
        return cnpj;
        }
        public int getCep() {
        return cep;
        }
        public String getEndereco() {
        return endereco;
        }
        public String getLougradouro() {
        return lougradouro;
        }
        public int getNumero() {
        return numero;
        }
        public String getComplemento() {
        return complemento;
        }
        public String getEstado() {
        return estado;
        }
        public String getMunicipio() {
        return municipio;
        }       
        public String nomeRazaoSocial() {
        return nomeRazaoSocial;
        }
        public String nomeFantasia() {
        return nomeFantasia;
        }
}
