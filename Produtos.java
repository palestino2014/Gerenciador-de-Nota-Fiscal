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
public class Produtos {
    
    int codigo;
    String nome;
    float preco;
    String categoria;

      void ins(String nome) {
            String novoProduto = this.nome;
             this.nome = novoProduto;
            }

      void cod(int codigo) {
            int novoCodigo = this.codigo;
            this.codigo = novoCodigo;
            }

      void valor(float preco){
           float novoPreco = this.preco;
           this.preco = this.preco;
           }

      void cat(String categoria){
            String novaCategoria = this.categoria;
            this.categoria = novaCategoria;
        }

    
}
