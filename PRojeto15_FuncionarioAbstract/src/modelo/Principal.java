/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vendedor v1 = new Vendedor(1000,  "vend1",  1000);
        Assistente a1 = new Assistente("Aux1", 1000);
        Gerente g1 = new Gerente("Ger1", 4000);
        
        System.out.println("Vendedor \nNome:" + v1.getNome()+ "\nsal_base: " +
                                                  v1.getSal_base()+ "\ncomissao: "+ 
                                                  v1.getComissao()+ "\n salario: "+
                                                  v1.calcsalario());
        
        System.out.println("a1 \nNome:" + a1.getNome()+ "\nsal_base: " +
                                            a1.getSal_base() + "\n sal_base: " +
                                            a1.calcsalario());
        
        System.out.println("g1 \nome:" +);
        
        
        
    }
    
}
