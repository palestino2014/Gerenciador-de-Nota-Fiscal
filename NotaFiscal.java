/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notafiscal;

/**
 *
 * @author informatica
 */
public class NotaFiscal {

    
 public static void main(String[] args) {
        // TODO code application logic here

            Emissor atualEmissor;
            atualEmissor = new Emissor();
            atualEmissor.cnpj = "111.111.111/0001-24";
            atualEmissor.nomeRazaoSocial = "Comercio de Software - ME";
            atualEmissor.nomeFantasia = "Online Facil";
            atualEmissor.inscricaoEstadual = 1111111;
            atualEmissor.regimeTributario = 171;
            atualEmissor.cep = 99999999;
            atualEmissor.endereco = "Rua Laranjal";
            atualEmissor.lougradouro = "NÃ£o possui";
            atualEmissor.numero = 35;
            atualEmissor.complemento = "NÃ£o possui";
            atualEmissor.bairro = "Centro";
            atualEmissor.cidade = "Limeira";
            atualEmissor.estado = "SP";

            InformacoesAdicionais atualInformacoesAdicionais;
            atualInformacoesAdicionais = new InformacoesAdicionais();
            atualInformacoesAdicionais.infAdProd = "Nota Fiscal isenta da informacoes adicionais";
            
            DadosNotaFiscalEletronica atualDadosNotaFiscalEletronica;
            atualDadosNotaFiscalEletronica = new DadosNotaFiscalEletronica();
            atualDadosNotaFiscalEletronica.serie = 1111111;
            atualDadosNotaFiscalEletronica.nNF = 123;
            atualDadosNotaFiscalEletronica.dhEmi = "10/05/12017";
            atualDadosNotaFiscalEletronica.dhSaiEnt =  "10/05/12017";
            atualDadosNotaFiscalEletronica.tpNF = "entrada" ;
            atualDadosNotaFiscalEletronica.indPag = "a vista";
            atualDadosNotaFiscalEletronica.indPres = "presencial";
            atualDadosNotaFiscalEletronica.natOp = "Natureza da operacao";
            atualDadosNotaFiscalEletronica.indFinal = "NÃ£o Ã© empresa";
            atualDadosNotaFiscalEletronica.idDest = "Interestadual";

            Receptor atualReceptor;
            atualReceptor = new Receptor();
            atualReceptor.cep = 123456789;
            atualReceptor.cnpj = "123456997";
            atualReceptor.complemento = "NÃ£o hÃ¡";
            atualReceptor.cpf = "123456789";
            atualReceptor.endereco = "Av. Fabricio Vampre";
            atualReceptor.estado = "SP";
            atualReceptor.idEstrangeiro = "";
            atualReceptor.iest = "";
            atualReceptor.inscricaoEstadual = 1;
            atualReceptor.lougradouro = "";
            atualReceptor.cidade = "Limeira";
            atualReceptor.nomeFantasia = "Comercial Santa Elisa";
            atualReceptor.numero = 77077;
            atualReceptor.razaoSocial = "Comercio de Software on-line Facil";
            atualReceptor.bairro = "Morro Azul";

            System.out.println("EndereÃ§o do emissor: " +  atualEmissor.endereco + atualEmissor.numero + atualEmissor.bairro + atualEmissor.cidade + atualEmissor.estado  );
            System.out.println("EndereÃ§o do receptor  " + atualReceptor.endereco + atualReceptor.numero + atualReceptor.bairro + atualReceptor.cidade + atualReceptor.estado );
            System.out.println("Data da emissÃ£o da nota fiscal  " + atualDadosNotaFiscalEletronica.dhEmi);
            }
}

