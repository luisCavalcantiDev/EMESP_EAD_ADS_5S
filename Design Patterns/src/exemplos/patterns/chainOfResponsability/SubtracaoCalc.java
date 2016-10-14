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
public class SubtracaoCalc extends Calculadora{

    public SubtracaoCalc() {
        super(Operacoes.SUBTRACAO);
    }

    @Override
    public double executarOperacao(double n1, double n2) {
        return n1 - n2;
    }
    
}
