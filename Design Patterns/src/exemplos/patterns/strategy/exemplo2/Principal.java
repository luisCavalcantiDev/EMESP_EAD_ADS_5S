/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.strategy.exemplo2;

/**
 *
 * @author cristianocamilo
 */
public class Principal {
    
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        double n = cal.defineOperacao(new Potenciacao()).retornaOperacao(5, 3);
        System.out.println("Resultado = " + n);
    }
    
}
