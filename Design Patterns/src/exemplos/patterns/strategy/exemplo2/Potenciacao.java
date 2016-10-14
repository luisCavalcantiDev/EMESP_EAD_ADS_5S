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
public class Potenciacao implements Operacao{

    @Override
    public double realizarOperacao2Numeos(double a, double b) {
        double novoNumero = 1;
        for (int i = 1; i <= b; i++) {
            novoNumero *= a;
        }
        return novoNumero;
    }
    
}
