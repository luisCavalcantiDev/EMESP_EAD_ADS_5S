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
public class PizzaPresunto implements Pizza{

    @Override
    public String imprimirIngredientes() {
        return "Presunto";
    }
    
}
