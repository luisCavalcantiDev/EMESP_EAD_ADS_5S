/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.iterator;

/**
 *
 * @author cristianocamilo
 */
public interface Iterator<C> {
    
    public boolean possuiProximo();
    
    public C proximo();
    
}
