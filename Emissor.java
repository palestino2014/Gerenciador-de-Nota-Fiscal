/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

/**
 *
 * @author gustavo
 */
public class Emissor extends Endereco {

    String cnpj;
    String nomeRazaoSocial;
    String nomeFantasia;
    int inscricaoEstadual;
    int regimeTributario;
     public String getCnpj() {
        return cnpj;
    }
    public String nomeRazaoSocial() {
        return nomeRazaoSocial;
    }
    public String nomeFantasia() {
        return nomeFantasia;
    }
    public int inscricaoEstadual() {
        return inscricaoEstadual;
    }
    public int regimeTributario() {
        return regimeTributario;
    }
}

