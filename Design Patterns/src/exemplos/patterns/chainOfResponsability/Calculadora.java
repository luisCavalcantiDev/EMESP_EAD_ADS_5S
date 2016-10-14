/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.chainOfResponsability;

/**
 *
 * @author cristianocamilo
 */
public abstract class Calculadora {
    
    private Calculadora next;
    protected Operacoes operacao;
    
    public Calculadora (Operacoes operacao) {
        this.operacao = operacao;
    }
    
    
    public void setNext(Calculadora calc){
        if (next == null){
            next = calc;
        } else {
            next.setNext(calc);
        }
    }
    
    public double calcular (Operacoes operacao , double n1, double n2){
        if(this.operacao == operacao){
            return executarOperacao(n1, n2);
        } else {
            if(this.next != null){
                return next.calcular(operacao, n1, n2);
            }
            return Double.MIN_VALUE;
        }
    }

    public abstract double executarOperacao(double n1, double n2);
    
}
