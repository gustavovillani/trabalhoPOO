package Classes;

import java.util.ArrayList;

public class Cliente extends Cadastro {
    private int numero;
   
    private ArrayList <RegistrarVenda>registrarvenda;
            
public void cadastrarCliete(){}
public void consultarCliete(){}
   
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >0){
        this.numero = numero;
        }
    }
    
}
