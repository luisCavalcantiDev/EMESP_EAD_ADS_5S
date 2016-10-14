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
public abstract class CalculadoraFactory {
    
    public static Calculadora getCalculadora(){
        Calculadora calc = new SomaCalc();
        calc.setNext( new SubtracaoCalc());
        calc.setNext( new MultiplicacaoCalc());
        return calc;
    }
}
