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
public class Gerente extends Funcionario {

    public Gerente() {
    }
    
    public Gerente(String nome, double sal_base) {
        super(nome, sal_base);
    }
    
    
    @Override
    public double calcsalario(){
        return (this.sal_base * 2);
    }      
    
    
}
