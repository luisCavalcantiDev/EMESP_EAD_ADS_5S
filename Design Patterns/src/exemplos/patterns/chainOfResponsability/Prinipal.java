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
public class Prinipal {
    
    
    public static void main(String[] args) {
        Calculadora calc = CalculadoraFactory.getCalculadora();
        
        System.out.println("Resultado da Operacao " + 
                calc.calcular(Operacoes.MULTIPLICACAO, 5, 9));
    }
    
}
