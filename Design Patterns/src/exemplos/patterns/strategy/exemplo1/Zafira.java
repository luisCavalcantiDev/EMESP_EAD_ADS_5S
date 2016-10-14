/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author cristianocamilo
 */
public class Zafira extends Carro{

    public Zafira() {
        super(new Transportar7Pessoas(), "Zafira");
    }
    
    
    
}
