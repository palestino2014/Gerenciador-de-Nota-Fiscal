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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Produtos meuProduto;
            meuProduto = new Produtos();
            
             meuProduto.nome = "desinfetante";
             meuProduto.categoria = "Material de Limpeza";
             meuProduto.codigo= 789456123 ;
             meuProduto.preco = 12;

             System.out.println("Produto cadastrado: " + meuProduto.nome  +   meuProduto.categoria  +  meuProduto.codigo  +   meuProduto.preco);

     
    }
    
}
