package notafiscal;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class RecolhimentoIcms {

    String icms; // forma de recolhimento
    int cst; // situacao tributaria
    String icmssn101; // SituaÃ§Ã£o tributÃ¡ria - 101 - Tributada com permissÃ£o de crÃ©dito
    float pCredSN; // AlÃ­quota de crÃ©dito ICMS
    float vCredICMSSN; // Valor crÃ©dito ICMS aproveitado
    String ICMSSN102; // CÃ³digo se destina Ã s operaÃ§Ãµes que nÃ£o permitem a indicaÃ§Ã£o da alÃ­quota do ICMS devido no Simples Nacional e que nÃ£o sÃ£o abrangidas pelos cÃ³digos 103, 203, 300, 400, 500 e 900.
    String ICMSSN103; // CÃ³digo se aplica Ã s operaÃ§Ãµes praticadas por optantes pelo Simples Nacional contemplados com isenÃ§Ã£o concedida para faixa de receita bruta.
    float vBCUFDest; // Deve ser informado o valor da base de cÃ¡lculo do ICMS no estado do destinatÃ¡rio, para onde a mercadoria em questÃ£o serÃ¡ transportada.
    float pICMSUFDest; // Deve ser informada a alÃ­quota interna do ICMS no estado de destino do produto, que varia entre 17% e 18%.
    float pICMSInter; // Deve ser informada a alÃ­quota interestadual que se aplica Ã  operaÃ§Ã£o. Ela serÃ¡ de 12%, exceto se o remetente estiver em um estado do Sul ou Sudeste (menos o EspÃ­rito Santo) e o destinatÃ¡rio nas regiÃµes Norte, Nordeste, Centro-Oeste ou no EspÃ­rito Santo. Nesses casos, ela cai para 7%.
    float pICMSInterPart; //  SerÃ¡ de 60% em 2017 (devido ao estado de destino da mercadoria).
    float vICMSUFDest; // Deve ser aplicado o Difal - Diferencial de AlÃ­quotas, informando quanto do ICMS devido cabe ao estado de destino da mercadoria. O recolhimento sÃ³ caberÃ¡ ao emissor se o cliente for pessoa fÃ­sica.
    float vICMSUFRemet; // Deve ser aplicado o Difal - Diferencial de AlÃ­quotas, informando quanto do ICMS devido cabe ao estado de origem da mercadoria. O recolhimento sÃ³ caberÃ¡ ao emissor se o cliente for pessoa fÃ­sica.
    float pFCPUFDest; // Caso haja Fundo de Combate Ã  Pobreza no estado de origem da mercadoria, Ã© preciso informar qual percentual cabe a ele do imposto recolhido.
    float vFCPUFDest;  // Caso haja Fundo de Combate Ã  Pobreza no estado de destino da mercadoria, Ã© preciso informar qual percentual cabe a ele do imposto recolhido.
    String ICMSSN201t;  // CÃ³digo se aplica Ã s operaÃ§Ãµes que permitem a indicaÃ§Ã£o da alÃ­quota do ICMS devido pelo Simples Nacional e do valor do crÃ©dito, e com cobranÃ§a do ICMS por substituiÃ§Ã£o tributÃ¡ria.
    String ICMSSN202;  // CÃ³digo se destina Ã s operaÃ§Ãµes que nÃ£o permitem a indicaÃ§Ã£o da alÃ­quota do ICMS devido no Simples Nacional e que nÃ£o sÃ£o abrangidas pelos cÃ³digos 103, 203, 300, 400, 500 e 900, e com cobranÃ§a do ICMS por substituiÃ§Ã£o tributÃ¡ria.
    String ICMSSN203;  // CÃ³digo se destina Ã s operaÃ§Ãµes nas quais hÃ¡ isenÃ§Ã£o do imposto para determinada faixa de receita bruta por optantes pelo Simples Nacional, e com cobranÃ§a do ICMS por substituiÃ§Ã£o tributÃ¡ria.
    String modBC;  //  Deve ser indicado por cÃ³digo se a modalidade de determinaÃ§Ã£o da base de cÃ¡lculo que se aplica Ã  operaÃ§Ã£o Ã© a de Margem Valor Agregado (cÃ³digo 0), pauta (1), preÃ§o tabelado mÃ¡ximo (2) ou valor da operaÃ§Ã£o (3).
    float pRedBC;  //  Informa o percentual de reduÃ§Ã£o na base de cÃ¡lculo do ICMS, se aplicÃ¡vel.
    float vBC;  // Informa a base de cÃ¡lculo do ICMS na operaÃ§Ã£o.
    float pICMS;  // Informa qual a alÃ­quota do ICMS aplicÃ¡vel Ã  operaÃ§Ã£o.
    float vICMSOp;  //  Indica o valor devido de ICMS na operaÃ§Ã£o.
    int CEST;  // Deve ser informado o CÃ³digo Especificador da SubstituiÃ§Ã£o TributÃ¡ria, identificando a mercadoria passÃ­vel de sujeiÃ§Ã£o ao regime de substituiÃ§Ã£o tributÃ¡ria e antecipaÃ§Ã£o de recolhimento do ICMS.
    int modBCST;  // Deve ser indicado por cÃ³digo se a modalidade de determinaÃ§Ã£o da base de cÃ¡lculo que se aplica Ã  operaÃ§Ã£o Ã© a de preÃ§o tabelado ou mÃ¡ximo sugerido (cÃ³digo 0), lista negativa (1), lista positiva (2), lista neutra (3), Margem Valor Agregado (4) ou pauta (5).
    float pMVAST;  // Margem de lucro estimada pelo governo federal desde a saÃ­da da mercadoria, considerando os ganhos do distribuidor e do estabelecimento que realizarÃ¡ a venda ao consumidor final.
    float pRedBCST;  // Informa o percentual de reduÃ§Ã£o na base de cÃ¡lculo do ICMS para aplicaÃ§Ã£o no regime de substituiÃ§Ã£o tributÃ¡ria.
    float vBCST;  // Informa o valor da base de cÃ¡lculo do ICMS na operaÃ§Ã£o sujeita Ã  substituiÃ§Ã£o tributÃ¡ria.
    float pICMSST;  // Informa qual a alÃ­quota do ICMS aplicÃ¡vel Ã  operaÃ§Ã£o sujeita Ã  substituiÃ§Ã£o tributÃ¡ria.
    float vICMSST;  // Indica o valor devido de ICMS na operaÃ§Ã£o sujeita Ã  substituiÃ§Ã£o tributÃ¡ria.
    int ICMSSN300;  // SituaÃ§Ã£o tributÃ¡ria - 300 - Imune CÃ³digo se aplica Ã s operaÃ§Ãµes realizadas por optantes pelo Simples Nacional e que recebem imunidade de ICMS.
    int ICMSSN400;  // SituaÃ§Ã£o tributÃ¡ria - 400 - NÃ£o tributada - SituaÃ§Ã£o tributÃ¡ria - 400 - NÃ£o tributada
    int ICMSSN500;  //  SituaÃ§Ã£o tributÃ¡ria - 500 - ICMS cobrado anteriormente por ST ou por antecipaÃ§Ã£o
    int ICMSSN900;  //     SituaÃ§Ã£o tributÃ¡ria - 900 - Outros - Cdigo se aplica Ã s operaÃ§Ãµes que nÃ£o se enquadrem nos cÃ³digos 101, 102, 103, 201, 202, 203, 300, 400 e 500.

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


