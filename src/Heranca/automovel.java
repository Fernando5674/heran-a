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
public class automovel  extends terrestre{
    
    private String cor;
    private String numPlaca;
    private int numPortas; 
  
    public automovel(){
        System.out.println("-----Impressão de Dados---");
         System.out.println("Placa:" +numPlaca);
          System.out.println("cor: "+cor);
           System.out.println("Numero de Portas: "+numPortas);
            System.out.println("N de Rodas "+numRodas);
            System.out.println("Capacidade: "+)
       
   }
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
