/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

/**
 *
 * @author gustavo
 */
public class  Emissor extends pessoa {

    int inscricaoEstadual;
    int regimeTributario;    

    public int inscricaoEstadual() {
        return inscricaoEstadual;
    }
    public int regimeTributario() {
        return regimeTributario;
    }
   @override
   public String getCnpjCpf() {
	return cnpjcpf;
   }
}
