package notafiscal;

// classe para produtos

public class Produtos {


  // atributos da classe

    String cProd; //codigo do produto
    String xProd; // descricao do produto
    String ncm; // nomenclatura comum do mercosul
    String uCom; // unidade comercial
    String qCom; // quantidade comercial
    String vUnCom; // valor unitario comercial
    String uTrib; // unidade de medida tributaria
    String qTrib; // especifica qd produtos na nota estao sujetios a tributacao
    String vUnTrib; // valor correspondente aos tributos aplicados para cada modelo de produto descrito na nota
    String vProd; // informa o valor total aplicado a todos os produtos descritos na nota fiscal
    String vFrete; // custo do frete
    String vSeg;  // valor total do seguro
    String vDesc; // valor total do desconto
    String outro; // outros valores que nao possui campo na nota fiscal
    String cFOP; // codigo fiscal de operacao e prestacao
    String cEANTrib; // código de barras
    String cPed; // inclui o numero do pedido de compra
    String nItemPed; // nuemero do item do pedido
    String orig; // codigo que informa a procedencia da mercadoria
    String imposto; // tributos
    String vTotTrib; // valor aproximado dos tributos


 // métodos da classe


    public String CProd() {
        return cProd;
    }

    public void setCProd(String CProd) {
         this.cProd = CProd;
    }
    
    
    public String XProd() {
        return xProd;
    }

    public void setXProd(String XProd) {
         this.xProd = XProd;
    }


    public String Ncm() {
        return ncm;
    }

    public void setNcm(String Ncm) {
        this.ncm = Ncm;
    }


    public String QCom() {
        return qCom;
    }

    public void setQCom(String QCom) {
        this.qCom = QCom;
    }


    public String UCom() {
        return uCom;
    }
    
    public void setUCom(String UCom) {
        this.uCom = UCom;
    }


    public String VUnCom() {
        return vUnCom;
    }

    public void setVUnCom(String VUnCom) {
        this.vUnCom = VUnCom;
    }


    public String UTrib() {
        return uTrib;
    }

    public void setUTrib(String UTrib) {
        this.uTrib = UTrib;
    }


    public String QTrib() {
        return qTrib;
    }

    public void setQTrib(String QTrib) {
        this.qTrib = QTrib;
    }



    public String VUnTrib() {
        return vUnTrib;
    }

    public void setVUnTrib(String VUnTrib) {
        this.vUnTrib = VUnTrib;
    }


    public String VProd() {
        return vProd;
    }

    public void setVProd(String VProd) {
        this.vProd = VProd;
    }


    public String VFrete() {
        return vFrete;
    }

    public void setVFrete(String VFrete) {
        this.vFrete = VFrete;
    }


    public String VSeg() {
        return vSeg;
    }

    public void setVSeg(String VSeg) {
        this.vSeg = VSeg;
    }


    public String VDesc() {
        return vDesc;
    }

    public void setVDesc(String VDesc) {
        this.vDesc = VDesc;
    }



    public String Outro() {
        return outro;
    }

    public void setOutro(String Outro) {
        this.outro = Outro;
    }



    public String CFOP() {
        return cFOP;
    }

    public void setCFOP(String CFOP) {
        this.cFOP = CFOP;
    }



    public String CEANTrib() {
    return cEANTrib;
    }

    public void setCEANTrib(String CEANTrib) {
        this.cEANTrib = CEANTrib;
    }



    public String CPed() {
        return cPed;
    }

    public void setCPed(String CPed) {
        this.cPed = CPed;
    }



    public String NItemPed() {
        return nItemPed;
    }

    public void setNItemPed(String NItemPed) {
        this.nItemPed = NItemPed;
    }


    public String Orig() {
        return orig;
    }

    public void setOrig(String Orig) {
        this.orig = Orig;
    }


    public String Imposto() {
        return imposto;
    }

    public void setImposto(String Imposto) {
        this.imposto = Imposto;
    }


    public String VTotTrib() {
        return vTotTrib;
    }

    public void setVTotTrib(String VTotTrib) {
        this.vTotTrib = VTotTrib;
    }


}
