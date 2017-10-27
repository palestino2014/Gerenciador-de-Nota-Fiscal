package notafiscal;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException; 

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            Emissor atualEmissor;
            atualEmissor = new Emissor();
            atualEmissor.cnpj = "111.111.111/0001-24";
            atualEmissor.nomeRazaoSocial = "Comercio de Software - ME";
            atualEmissor.nomeFantasia = "Online Facil";
            atualEmissor.inscricaoEstadual = 1111111;
            atualEmissor.regimeTributario = 171;
            atualEmissor.cep = 99999999;
            atualEmissor.endereco = "Rua Laranjal";
            atualEmissor.lougradouro = "Não possui";
            atualEmissor.numero = 35;
            atualEmissor.complemento = "Não possui";
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
            atualDadosNotaFiscalEletronica.indFinal = "Não é empresa";
            atualDadosNotaFiscalEletronica.idDest = "Interestadual";

            Receptor atualReceptor;
            atualReceptor = new Receptor();
            atualReceptor.cep = 123456789;
            atualReceptor.cnpj = "123456997";
            atualReceptor.complemento = "Não há";
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

            Produtos atualProdutos;
            atualProdutos = new Produtos();
            atualProdutos.CFOP = "venda";
            atualProdutos.NCM = 190171;
            atualProdutos.Outro = 785;
            atualProdutos.cEANTrib = 121221;
            atualProdutos.cPed = 1100110;
            atualProdutos.cProd = 111;
            atualProdutos.imposto = "12.45";
            atualProdutos.nItemPed = 10;
            atualProdutos.orig = 1;
            atualProdutos.qCom = "2";
            atualProdutos.qTrib = "2";
            atualProdutos.vDesc = 10;
            atualProdutos.vFrete = 2;
            atualProdutos.vProd = 1;
            atualProdutos.vSeg = 1;
            atualProdutos.xProd = "Passagem";

            RecolhimentoIcms atualRecolhimentoIcms;
            atualRecolhimentoIcms = new RecolhimentoIcms();
            atualRecolhimentoIcms.CEST = 123;
            atualRecolhimentoIcms.ICMSSN300 = 300;
            atualRecolhimentoIcms.ICMSSN400 = 400;
            atualRecolhimentoIcms.ICMSSN500 = 500;
            atualRecolhimentoIcms.ICMSSN900 = 900;
            atualRecolhimentoIcms.cst = 1;
            atualRecolhimentoIcms.modBCST = 1;
            atualRecolhimentoIcms.ICMSSN102 = "103";
            atualRecolhimentoIcms.ICMSSN103 = "103";
            atualRecolhimentoIcms.ICMSSN201t = "103";
            atualRecolhimentoIcms.ICMSSN202 =  "103";
            atualRecolhimentoIcms.ICMSSN203 = "103";
            atualRecolhimentoIcms.icms = "1";
            atualRecolhimentoIcms.icmssn101 = "1";
            atualRecolhimentoIcms.modBC = "1";
            atualRecolhimentoIcms.pCredSN = 1;
            atualRecolhimentoIcms.pFCPUFDest = 1;
            atualRecolhimentoIcms.pICMS =  1;
            atualRecolhimentoIcms.pICMSInter =  1;
            atualRecolhimentoIcms.pICMSInterPart =  1;
            atualRecolhimentoIcms.pICMSST =  1;
            atualRecolhimentoIcms.pICMSUFDest = 1;
            atualRecolhimentoIcms.pMVAST =  1;
            atualRecolhimentoIcms.pRedBC = 1;
            atualRecolhimentoIcms.pRedBCST =  1;
            atualRecolhimentoIcms.vBC =  1;
            atualRecolhimentoIcms.vBCST =  1;
            atualRecolhimentoIcms.vBCUFDest =  1;
            atualRecolhimentoIcms.vCredICMSSN =  1;
            atualRecolhimentoIcms.pICMSUFDest = 1;
            atualRecolhimentoIcms.vICMSOp = 1;
            atualRecolhimentoIcms.vICMSST = 1;
            atualRecolhimentoIcms.vICMSUFDest = 1;
            atualRecolhimentoIcms.vICMSUFRemet =  1;

            TotaisNota atualTotaisNota;
            atualTotaisNota = new TotaisNota();
            atualTotaisNota.Desc = 2;
            atualTotaisNota.infAdProd = 2;
            atualTotaisNota.vBC = 2;
            atualTotaisNota.vBCST = 2;
            atualTotaisNota.vCOFINS = 2;
            atualTotaisNota.vFrete = 2;
            atualTotaisNota.vICMS = 2;
            atualTotaisNota.vIPI = 2;
            atualTotaisNota.vNF = 2;
            atualTotaisNota.vOutro = 2;
            atualTotaisNota.vPIS = 2;
            atualTotaisNota.vST = 2;
            atualTotaisNota.vSeg = 2;
            atualTotaisNota.vTotTrib = 2;

            System.out.println("Emissor =  " + atualEmissor.nomeRazaoSocial);
            System.out.println("Endereço do emissor =" +  atualEmissor.endereco + atualEmissor.numero + atualEmissor.bairro + atualEmissor.cidade + atualEmissor.estado  );
            System.out.println("Receptor =  " + atualReceptor.nomeFantasia);
            System.out.println("Endereço do receptor = " + atualReceptor.endereco + atualReceptor.numero + atualReceptor.bairro + atualReceptor.cidade + atualReceptor.estado );
            System.out.println("Data da emissão da nota fiscal = " + atualDadosNotaFiscalEletronica.dhEmi);
            System.out.println("Desconto nota =  " + atualTotaisNota.Desc);
            System.out.println("Recolhimeto Icms =  " + atualRecolhimentoIcms.pCredSN);
            System.out.println("Produto (Item) =  " + atualProdutos.xProd );

         String textoQueSeraEscrito = "Texto que sera escrito.";
         FileWriter arquivo;

	// criar arquivo em .XML	        
	try {
             arquivo = new FileWriter(new File("arquivos/emissor.xml"));
             arquivo.write(atualEmissor.nomeRazaoSocial + atualEmissor.endereco + atualEmissor.numero + atualEmissor.bairro + atualEmissor.cidade + atualEmissor.estado);
             arquivo.close();
          } catch (IOException e) {
             e.printStackTrace();
          } catch (Exception e) {
            e.printStackTrace();
         }
       }
    }      


