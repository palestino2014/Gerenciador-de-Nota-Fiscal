/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

/**
 *
 * @author gustavo
 */
public class Receptor extends pessoa {

   String idEstrangeiro;
   String razaoSocial;
   int inscricaoEstadual;
   String iest; //Inscrição Estadual Substituto Tributário
   
    public String getCnpjCpf() {
    return cnpjcpf;
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
