package Classes;

import java.util.ArrayList;

public class Cliente extends Cadastro {
    private int numero;
   
    private ArrayList <RegistrarVenda>registrarvendas;
            
    public Cliente(){
    registrarvendas = new ArrayList<RegistrarVenda>();
    }
    
    public void adicionarRegistrarVenda(RegistrarVenda registrarvenda){
    registrarvendas .add(registrarvenda);
    }
    
    public void excluirRegistrarVenda(RegistrarVenda registrarvenda){
    registrarvendas.remove(registrarvenda);
    }
    
    public int quantidadeRegistrarVenda( RegistrarVenda registrarvenda){
      return registrarvendas.size();
    }
     
    public RegistrarVenda getRegistrarVenda(int posicao){
        return registrarvendas.get(posicao);
    }

   
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >0){
        this.numero = numero;
        }
    }
    
}
