package projetosistema;

import Classes.Produto;

public class ProjetoSistema {
    
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setDescricao("Camisa");
        produto1.setPreco(0.00);
        produto1.setQuantidade(0);
        
    System.out.println("Produto 1");
    System.out.println("descricao do produto: " + produto1.getDescricao());
    System.out.println("valor do produto: " + produto1.getPreco());
    System.out.println("Quantidade do produto: " + produto1.getQuantidade());
    }
    
}
