/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.abstractfactory.exercicio;

/**
 *
 * @author cristianocamilo
 */
public class PizzaioloBrasileiro implements Pizzaiolo{

    @Override
    public Pizza montarPizza() {
        return new PizzaPresunto();
    }
    
    
}
