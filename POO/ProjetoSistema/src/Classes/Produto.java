package Classes;

import java.util.ArrayList;

public class Produto {
    private String descricao;
    private int quantidade;
    private Double preco;
    
    private RegistrarVenda registrarvendas;
    private ArrayList<Fornecedor>fornecedores;

    
     public Produto(){
    fornecedores = new ArrayList<Fornecedor>();
    }
    
    public void adicionarFornecedor(Fornecedor fornecedor){
    fornecedores .add(fornecedor);
    }
    
    public void excluirFornecedor( Fornecedor fornecedor){
    fornecedores.remove(fornecedor);
    }
    
    public int quantidadeFornecedor( Fornecedor fornecedor){
      return fornecedores.size();
    }
     
    public Fornecedor getFornecedor(int posicao){
        return fornecedores.get(posicao);
    }    
    
    
    
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >=0){
        this.quantidade = quantidade;
        }
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco > 0){
        this.preco = preco;
       }
    }

    public RegistrarVenda getRegistrarvendas() {
        return registrarvendas;
    }

    public void setRegistrarvendas(RegistrarVenda registrarvendas) {
        this.registrarvendas = registrarvendas;
    }
    
}
