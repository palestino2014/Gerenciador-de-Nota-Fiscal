package notafiscal;

 // Classe receptor

public class Receptor extends Pessoa {

// atributos da classe receptor


   String idEstrangeiro;
   String razaoSocial;
   String inscricaoEstadual;
   String iest; //Inscrição Estadual Substituto Tributário

 
// métodos da classe receptor

    public String CnpjCpf() {
        return cnpjcpf;
    }

    public void setCnpjCpf(String CnpjCpf) {
        this.cnpjcpf = CnpjCpf;
    }


    public String IdEstrangeiro() {
        return idEstrangeiro;
    }

    public void setIdEstrangeiro(String IdEstrangeiro) {
        this.idEstrangeiro = IdEstrangeiro;
    }


    public String RazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
         this.razaoSocial = RazaoSocial;
    }


    public String NomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
         this.nomeFantasia = NomeFantasia;
   }


    public String InscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String InscricaoEstadual) {
         this.inscricaoEstadual = InscricaoEstadual;
   }

    
    public String Iest() {
        return iest;
    }

    public void setIest(String Iest) {
        this.iest =  Iest;
   }


}
