package Classes;

import java.util.ArrayList;

class Vendedor {
    private String login;
    private String senha;
  
    private ArrayList<RegistrarVenda>registrarvendas;
   
   public Vendedor(){
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
   
    
    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
