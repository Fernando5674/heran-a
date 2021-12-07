/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class principal {
    public static void main(String[] args) {
       
        automovel carro = new automovel();
        automovel moto = new automovel();
                
        carro.setNumPlaca("ksksksksk");
        carro.setNumPortas(4);
        carro.setCor("Branco");
        carro.setNumRodas(4);
        carro.setCapacidade(5);
        
        moto.setCapacidade(2);
        moto.setNumRodas(2);
        moto.setCor("Azul");
        moto.setNumPortas(0);
        moto.setPlaca("jjuiwe7889");
                        
                
                
                
                
    }
}
