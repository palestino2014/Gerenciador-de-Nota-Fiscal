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

    int serie; // SequÃªncia numÃ©rica que indica a qual sÃ©rie a nota fiscal em questÃ£o se refere, de 001 a 999, sendo que o intervalo de 890 a 899 Ã© exclusivo para emissÃ£o de NF-e avulsa e, de 900 a 999, para emissÃ£o em contingÃªncia.
    int nNF; //  Indica a numeraÃ§Ã£o da nota conforme a sÃ©rie, atendendo a uma sequÃªncia entre 1 a 999.999.999, sendo Ãºnico e exclusivo para um determinado documento fiscal.
    String dhEmi; // Registra o dia e a hora exata em que a nota fiscal eletrÃ´nica foi emitida.
    String dhSaiEnt; // Registra o dia e a hora exata em que ocorreu a movimentaÃ§Ã£o da mercadoria, deixando ou retornando Ã  empresa.
    String tpNF; //  Indica basicamente se a operaÃ§Ã£o se refere Ã  entrada ou saÃ­da de mercadorias.
    String indPag; //  Registra como a operaÃ§Ã£o em questÃ£o serÃ¡ paga pelo destinatÃ¡rio, considerando as opÃ§Ãµes â€œÃ  vistaâ€�, â€œa prazoâ€� e â€œoutrasâ€�.
    String indPres; //  Esse campo se destina a informar se a operaÃ§Ã£o foi realizada de forma presencial ou nÃ£o, incluindo internet, telefone e outros meios.
    String natOp; //  Indica se a operaÃ§Ã£o Ã  qual a nota se refere estÃ¡ destinada Ã  venda de mercadoria, remessa, devoluÃ§Ã£o ou consignaÃ§Ã£o, por exemplo.
    String indFinal; //  Essa opÃ§Ã£o deve ser assinalada quando a operaÃ§Ã£o tem como destinatÃ¡rio um consumidor final e nÃ£o uma empresa que irÃ¡ revender a mercadoria.
    String idDest; // Informa se a operaÃ§Ã£o Ã© interna (dentro do estado), interestadual ou com destinatÃ¡rio estabelecido no exterior.

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
