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
public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor() {
    }
    
    
     public Vendedor(double comissao, String nome, double sal_base) {
         super(nome, sal_base);
         this.comissao = comissao;
    }
     //getter e setter

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
       
   //metodo herdado 
    @Override
    public double calcsalario(){
        return (this.sal_base + this.comissao);
    }
}
