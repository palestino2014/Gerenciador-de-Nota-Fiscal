package notafiscal;

 // Classe para valores totais

public class TotaisNota {


 // atributos da classe

    String infAdProd; // Valor total dos produtos
    String vFrete; // valor total do frete
    String vSeg; // valor total do seguro
    String desc; //  valor total do seguro
    String vOutro; //  outras despesas
    String vICMS; // valor do ICMS
    String vBC; // base de calculo do ICMS
    String vBCST; //  valor do ICMS-ST - Repete a informação sobre a base de cálculo do ICMS na operação sujeita à substituição tributária.
    String vST; // Repete a informação sobre o valor devido de ICMS na operação sujeita à substituição tributária.
    String vIPI; // Informa o valor total devido na operação de Imposto sobre Produtos Industrializados, se aplicável.
    String vPIS; //  Informa o valor total devido na operação para o Programa de Integração Social, se aplicável.
    String vCOFINS; // Informa o valor total devido na operação a Contribuição para o Financiamento da Seguridade Social, se aplicável.
    String vNF; //  Indica o valor total da nota fiscal eletrônica, resultando da soma de todos os valores de produtos e impostos.
    String vTotTrib; // Valor aproximado dos tributos (R$) - Repete a estimativa em reais o valor de tributos federais, estaduais e municipais que influenciam na formação dos preços dos produtos descritos na nota.


 // metodos da classe
 
    public String InfAdProd() {
        return infAdProd;
    }

    public void setInfAdProd(String InfAdProd) {
            this.infAdProd = InfAdProd;
    }



    public String InfvFrete() {
        return vFrete;
    }

    public void setInfvFrete(String InfvFrete) {
            this.vFrete = InfvFrete;
    }



    public String VSeg() {
        return vSeg;
    }

    public void setVSeg(String VSeg) {
            this.vSeg = VSeg;
    }



    public String Desc() {
        return desc;
    }

    public void setDesc(String Desc) {
            this.desc = Desc;
    }


    public String Outro() {
        return vOutro;
    }

    public void setOutro(String Outro) {
            this.vOutro = Outro;
    }



    public String VICMS() {
        return vICMS;
    }

    public void setVICMS(String VICMS) {
            this.vICMS = VICMS;
    }



    public String VBC() {
        return vBC;
    }

    public void setVBC(String VBC) {
            this.vBC = VBC;
    }



    public String VBCST() {
        return vBCST;
    }

    public void setVBCST(String VBCST) {
            this.vBCST = VBCST;
    }




    public String VST() {
        return vST;
    }

    public void setVST(String VST) {
            this.vST = VST;
    }


    public String VIPI() {
        return vIPI;
    }

    public void setVIPI(String VIPI) {
            this.vIPI = VIPI;
    }


    public String VPIS() {
        return vPIS;
    }

    public void setVPIS(String VPIS) {
            this.vPIS = VPIS;
    }



    public String VCOFINS() {
        return  vCOFINS;
    }

    public void setVCOFINS(String VCOFINS) {
            this.vCOFINS = VCOFINS;
    }



    public String VNF() {
        return  vNF;
    }

    public void setVNF(String VNF) {
            this.vNF = VNF;
    }


    public String VTotTrib() {
        return  vTotTrib;
    }

    public void setVTotTrib(String VTotTrib) {
            this.vTotTrib = VTotTrib;
    }


}
