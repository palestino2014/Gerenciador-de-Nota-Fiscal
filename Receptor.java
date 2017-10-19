/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

/**
 *
 * @author gustavo
 */
public class Receptor extends Endereco {

    String cpf;
    String cnpj;
    String idEstrangeiro;
    String razaoSocial;
    String nomeFantasia;
    int inscricaoEstadual;
    String iest; //InscriÃ§Ã£o Estadual Substituto TributÃ¡rio
  
    public String getCpf() {
    return cpf;
    }
    public String getCnpj() {
    return cnpj;
    }
     public String getIdEstrangeiro() {
    return idEstrangeiro;
    }
    public String getRazaoSocial() {
    return razaoSocial;
    }
    public String getNomeFantasia() {
    return nomeFantasia;
    }
    public int getInscricaoEstadual() {
    return inscricaoEstadual;
    }
    public String getIest() {
    return iest;
    }
}
