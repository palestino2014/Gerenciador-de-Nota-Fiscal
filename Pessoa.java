package notafiscal;


public abstract class Pessoa {
     
    // Atributos da classe pessoa
      
       public String pessoa;
       public String nomeRazaoSocial;
       public String nomeFantasia;
       public String cep;
       public String endereco;
       public String lougradouro;
       public String numero;
       public String complemento;
       public String estado;
       public String municipio ;
       public String bairro;
       public String cidade;
       public String cnpj;
       public String cpf;
       public String cnpjcpf;



    // Método para retorar o número do CPF

        public String Cpf() {
            return cpf;
        }

       public void setCpf(String Cpf) {
            this.cpf = Cpf;
        }

   
    // Método para retorar o número do CNPJ
   
        public String Cnpj() {
            return cnpj;
        }

        public void setCnpj(String Cnpj) {
            this.cnpj = Cnpj;
        }
     
    
    // Método para retorar o número do Cep
    
        public String Cep() {
            return cep;
        }

        public void setCep(String Cep) {
            this.cep = Cep;
        }


    // Método para retorar o endereço

        public String Endereco() {
            return endereco;
        }

        public void setEndereco(String Endereco) {
            this.endereco = Endereco;
        }


    // Método para retorar o Lougradouro
      
        public String Lougradouro() {
            return lougradouro;
        }

        public void setLougradouro(String Lougradouro) {
            this.lougradouro = Lougradouro;
        }


    // Método para retorar o número do imóvel

        public String Numero() {
            return numero;
        }

        public void setNumero(String Numero) {
            this.numero = Numero;
        }


    // Método para retorar o Complemento

        public String Complemento() {
            return complemento;
        }
        
        public void setComplemento(String Complemento) {
            this.complemento = Complemento;
        }


   // Método para retorar o Estado

        public String Estado() {
            return estado;
        }

        public void setEstado(String Estado) {
            this.estado = Estado;
        }



    // Método para retorar o Municipio

        public String Municipio() {
            return municipio;
        }

        public void setMunicipio(String Municipio) {
            this.municipio = Municipio;
        }


    // Método para retorar o Bairro

        public String Bairro() {
            return bairro;
        }

        public void setBairro(String Bairro) {
            this.bairro = Bairro;
        }


    // Método para retorar o CIdade

        public String Cidade() {
            return cidade;
        }

        public void setCidade(String Cidade) {
            this.cidade = Cidade;
        }



    // Método para retorar a Razão Social
  
        public String nomeRazaoSocial() {
            return nomeRazaoSocial;
        }

        public void setnomeRazaoSocial(String nomeRazaoSocial) {
            this.nomeRazaoSocial = nomeRazaoSocial;
        }



    // Método para retorar a nome fantasia
 
        public String nomeFantasia() {
            return nomeFantasia;
        }

       public void setnomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
       }


}
