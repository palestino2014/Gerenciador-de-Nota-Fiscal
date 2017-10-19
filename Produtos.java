/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

/**
 *
 * @author gustavo
 */
public class Produtos {


    int cProd; //codigo do produto
    String xProd; // descricao do produto
    int NCM; // nomenclatura comum do mercosul
    String uCom; // unidade comercial
    String qCom; // quantidade comercial
    String vUnCom; // valor unitario comercial
    String uTrib; // unidade de medida tributaria
    String qTrib; // especifica qd produtos na nota estao sujetios a tributacao
    float vUnTrib; // valor correspondente aos tributos aplicados para cada modelo de produto descrito na nota
    float vProd; // informa o valor total aplicado a todos os produtos descritos na nota fiscal
    float vFrete; // custo do frete
    float vSeg;  // valor total do seguro
    float vDesc; // valor total do desconto
    float Outro; // outros valores que nao possui campo na nota fiscal
    String CFOP; // codigo fiscal de operacao e prestacao
    int cEANTrib; // cÃ³digo de barras
    int cPed; // inclui o numero do pedido de compra
    int nItemPed; // nuemero do item do pedido
    int orig; // codigo que informa a procedencia da mercadoria
    String imposto; // tributos
    Float vTotTrib; // valor aproximado dos tributos

    public int getcProd() {
     return cProd;
    }
    public String getxProd() {
     return xProd;
    }
    public int getNCM() {
     return NCM;
    }
    public String getqCom() {
     return qCom;
    }
    public String getuCom() {
     return uCom;
    }
    public String getvUnCom() {
     return vUnCom;
    }
    public String getuTrib() {
     return uTrib;
    }
    public String getqTrib() {
     return qTrib;
    }
    public float getvUnTrib() {
     return vUnTrib;
    }
    public float getvProd() {
     return vProd;
    }
    public float getvFrete() {
     return vFrete;
    }
    public float getvSeg() {
    return vSeg;
    }
    public float getvDesc() {
    return vDesc;
    }
    public float getOutro() {
    return Outro;
    }
    public String getCFOP() {
    return CFOP;
    }
    public int getcEANTrib() {
    return cEANTrib;
    }
    public int getcPed() {
    return cPed;
    }
    public int getnItemPed() {
    return nItemPed;
    }
    public int getorig() {
    return orig;
    }
    public String getimposto() {
    return imposto;
    }
    public float getvTotTrib() {
    return vTotTrib;
    }

}

