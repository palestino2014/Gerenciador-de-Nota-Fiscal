package notafiscal;

// Classe recolhimento Icms

public class RecolhimentoIcms {

// Classe atributos do Icms


    String icms; // forma de recolhimento
    int cst; // situacao tributaria
    String icmssn101; // Situação tributária - 101 - Tributada com permissão de crédito
    float pCredSN; // Alíquota de crédito ICMS
    float vCredICMSSN; // Valor crédito ICMS aproveitado
    String ICMSSN102; // Código se destina às operações que não permitem a indicação da alíquota do ICMS devido no Simples Nacional e que não são abrangidas pelos códigos 103, 203, 300, 400, 500 e 900.
    String ICMSSN103; // Código se aplica às operações praticadas por optantes pelo Simples Nacional contemplados com isenção concedida para faixa de receita bruta.
    float vBCUFDest; // Deve ser informado o valor da base de cálculo do ICMS no estado do destinatário, para onde a mercadoria em questão será transportada.
    float pICMSUFDest; // Deve ser informada a alíquota interna do ICMS no estado de destino do produto, que varia entre 17% e 18%.
    float pICMSInter; // Deve ser informada a alíquota interestadual que se aplica à operação. Ela será de 12%, exceto se o remetente estiver em um estado do Sul ou Sudeste (menos o Espírito Santo) e o destinatário nas regiões Norte, Nordeste, Centro-Oeste ou no Espírito Santo. Nesses casos, ela cai para 7%.
    float pICMSInterPart; //  Será de 60% em 2017 (devido ao estado de destino da mercadoria).
    float vICMSUFDest; // Deve ser aplicado o Difal - Diferencial de Alíquotas, informando quanto do ICMS devido cabe ao estado de destino da mercadoria. O recolhimento só caberá ao emissor se o cliente for pessoa física.
    float vICMSUFRemet; // Deve ser aplicado o Difal - Diferencial de Alíquotas, informando quanto do ICMS devido cabe ao estado de origem da mercadoria. O recolhimento só caberá ao emissor se o cliente for pessoa física.
    float pFCPUFDest; // Caso haja Fundo de Combate à Pobreza no estado de origem da mercadoria, é preciso informar qual percentual cabe a ele do imposto recolhido.
    float vFCPUFDest;  // Caso haja Fundo de Combate à Pobreza no estado de destino da mercadoria, é preciso informar qual percentual cabe a ele do imposto recolhido.
    String ICMSSN201t;  // Código se aplica às operações que permitem a indicação da alíquota do ICMS devido pelo Simples Nacional e do valor do crédito, e com cobrança do ICMS por substituição tributária.
    String ICMSSN202;  // Código se destina às operações que não permitem a indicação da alíquota do ICMS devido no Simples Nacional e que não são abrangidas pelos códigos 103, 203, 300, 400, 500 e 900, e com cobrança do ICMS por substituição tributária.
    String ICMSSN203;  // Código se destina às operações nas quais há isenção do imposto para determinada faixa de receita bruta por optantes pelo Simples Nacional, e com cobrança do ICMS por substituição tributária.
    String modBC;  //  Deve ser indicado por código se a modalidade de determinação da base de cálculo que se aplica à operação é a de Margem Valor Agregado (código 0), pauta (1), preço tabelado máximo (2) ou valor da operação (3).
    float pRedBC;  //  Informa o percentual de redução na base de cálculo do ICMS, se aplicável.
    float vBC;  // Informa a base de cálculo do ICMS na operação.
    float pICMS;  // Informa qual a alíquota do ICMS aplicável à operação.
    float vICMSOp;  //  Indica o valor devido de ICMS na operação.
    int CEST;  // Deve ser informado o Código Especificador da Substituição Tributária, identificando a mercadoria passível de sujeição ao regime de substituição tributária e antecipação de recolhimento do ICMS.
    int modBCST;  // Deve ser indicado por código se a modalidade de determinação da base de cálculo que se aplica à operação é a de preço tabelado ou máximo sugerido (código 0), lista negativa (1), lista positiva (2), lista neutra (3), Margem Valor Agregado (4) ou pauta (5).
    float pMVAST;  // Margem de lucro estimada pelo governo federal desde a saída da mercadoria, considerando os ganhos do distribuidor e do estabelecimento que realizará a venda ao consumidor final.
    float pRedBCST;  // Informa o percentual de redução na base de cálculo do ICMS para aplicação no regime de substituição tributária.
    float vBCST;  // Informa o valor da base de cálculo do ICMS na operação sujeita à substituição tributária.
    float pICMSST;  // Informa qual a alíquota do ICMS aplicável à operação sujeita à substituição tributária.
    float vICMSST;  // Indica o valor devido de ICMS na operação sujeita à substituição tributária.
    int ICMSSN300;  // Situação tributária - 300 - Imune Código se aplica às operações realizadas por optantes pelo Simples Nacional e que recebem imunidade de ICMS.
    int ICMSSN400;  // Situação tributária - 400 - Não tributada - Situação tributária - 400 - Não tributada
    int ICMSSN500;  //  Situação tributária - 500 - ICMS cobrado anteriormente por ST ou por antecipação
    int ICMSSN900;  //     Situação tributária - 900 - Outros - Cdigo se aplica às operações que não se enquadrem nos códigos 101, 102, 103, 201, 202, 203, 300, 400 e 500.


// métodos da classe

    public String getIcms() {
        return icms;
    }

    public int getCst() {
        return cst;
    }

    public String getIcmssn101() {
        return  icmssn101;
    }

    public float getpCredSN() {
        return  pCredSN;
    }

    public String getICMSSN102() {
        return ICMSSN102;
    }

    public float getvCredICMSSN() {
        return  vCredICMSSN;
    }

    public String getICMSSN103() {
        return ICMSSN103;
    }

    public float getvBCUFDest() {
        return vBCUFDest;
    }

    public float getpICMSUFDest() {
        return pICMSUFDest;
    }

    public float getpICMSInter() {
        return pICMSInter;
    }

    public float getpICMSInterPart() {
        return  pICMSInterPart;
    }

    public float getvICMSUFDest() {
        return  vICMSUFDest;
    }

    public float getvICMSUFRemet() {
        return  vICMSUFRemet;
    }

    public float getpFCPUFDest() {
        return  pFCPUFDest;
    }

    public float getvFCPUFDest() {
        return  vFCPUFDest;
    }

    public String getICMSSN201t() {
        return ICMSSN201t;
    }

    public String getICMSSN202() {
        return ICMSSN202;
    }

    public String getICMSSN203() {
        return ICMSSN203;
    }

    public String getmodBC() {
        return modBC;
    }

    public float getpRedBC() {
        return pRedBC;
    }

    public float getvBC() {
        return vBC;
    }

    public float getpICMS() {
        return pICMS;
    }
    
    public float getvICMSOp() {
        return vICMSOp;
    }

    public int getCEST() {
        return CEST;
    }

    public int getmodBCST() {
        return modBCST;
    }

    public float getpMVAST() {
        return pMVAST;
    }

    public float getpRedBCST() {
        return pRedBCST;
    }

    public float getvBCST() {
        return vBCST;
    }

    public float getpICMSST() {
        return pICMSST;
    }

    public float getvICMSST() {
        return  vICMSST;
    }

    public int getICMSSN300() {
        return   ICMSSN300;
    }

    public int getICMSSN400() {
        return   ICMSSN400;
    }

    public int getICMSSN500() {
        return   ICMSSN500;
    }

    public int getICMSSN900() {
        return   ICMSSN500;
    }
    

}

