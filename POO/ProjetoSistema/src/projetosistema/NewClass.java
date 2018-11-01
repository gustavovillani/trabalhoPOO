/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosistema;

import Classes.Cliente;
import Classes.RegistrarVenda;
import java.util.Date;

/**
 *
 * @author gustavo.villani
 */
public class NewClass {
    public static void main (String[] args){
    
    RegistrarVenda registrarvendas1= new RegistrarVenda();
    registrarvendas1.setTipoPagamento("Debito");
    RegistrarVenda registrarvendas2= new RegistrarVenda();
    registrarvendas2.setTipoPagamento("Credito");
    
        
    Cliente cliente1 = new Cliente();
    cliente1.setNome("jao");
    cliente1.setDataCadastro(new Date());
    cliente1.setCidade("Curitiba");
    cliente1.setDataNascimento(new Date());
    cliente1.setCPF("043664581-02");
    cliente1.setEndereco("rua 1");
    cliente1.setNumero(700);
    
     Cliente cliente2 = new Cliente();
    cliente2.setNome("maria");
    cliente2.setDataCadastro(new Date());
    cliente2.setCidade("Curitiba");
    cliente2.setDataNascimento(new Date());
    cliente2.setCPF("456998271-02");
    cliente2.setEndereco("rua 2");
    cliente2.setNumero(700);
    
    System.out.println("compra cliente 1");
    System.out.println(cliente1.getNome());
    System.out.println();
    
    
    } 
}
