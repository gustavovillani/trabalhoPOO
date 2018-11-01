package Classes;

import java.util.ArrayList;

public class RegistrarVenda {
  private String tipoPagamento;
  
   private Vendedor vendedor;
   private Cliente cliente;
  
   private ArrayList<Produto>produtos;
  //private ArrayList<Quantidade>quantidades;

public void cadastrarVenda(){}
public void consultarVenda(){} 

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
   
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
