/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

/**
 *
 * @author gustavo
 */
public class DadosNotaFiscalEletronica {

    int serie; // Sequência numérica que indica a qual série a nota fiscal em questão se refere, de 001 a 999, sendo que o intervalo de 890 a 899 é exclusivo para emissão de NF-e avulsa e, de 900 a 999, para emissão em contingência.
    int nNF; //  Indica a numeração da nota conforme a série, atendendo a uma sequência entre 1 a 999.999.999, sendo único e exclusivo para um determinado documento fiscal.
    String dhEmi; // Registra o dia e a hora exata em que a nota fiscal eletrônica foi emitida.
    String dhSaiEnt; // Registra o dia e a hora exata em que ocorreu a movimentação da mercadoria, deixando ou retornando à empresa.
    String tpNF; //  Indica basicamente se a operação se refere à entrada ou saída de mercadorias.
    String indPag; //  Registra como a operação em questão será paga pelo destinatário, considerando as opções “à vista”, “a prazo” e “outras”.
    String indPres; //  Esse campo se destina a informar se a operação foi realizada de forma presencial ou não, incluindo internet, telefone e outros meios.
    String natOp; //  Indica se a operação à qual a nota se refere está destinada à venda de mercadoria, remessa, devolução ou consignação, por exemplo.
    String indFinal; //  Essa opção deve ser assinalada quando a operação tem como destinatário um consumidor final e não uma empresa que irá revender a mercadoria.
    String idDest; // Informa se a operação é interna (dentro do estado), interestadual ou com destinatário estabelecido no exterior.

           public int getserie() {
           return serie;
    }
           public int getnNF() {
           return nNF;
    }
            public String getdhEmi() {
            return dhEmi;
    }
            public String getdhSaiEnt() {
            return dhSaiEnt;
    }
            public String gettpNF() {
            return tpNF;
    }
            public String getindPag() {
            return indPag;
    }
            public String getindPres() {
            return indPres;
    }
            public String getnatOp() {
            return natOp;
    }
            public String getindFinal() {
            return indFinal;
    }
            public String getidDest() {
            return idDest;
    }
}
