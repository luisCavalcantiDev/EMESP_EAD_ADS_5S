/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads5.exec1;

/**
 *
 * @author cristianocamilo
 */
public abstract class PizzaioloFactory {
    
    public static Pizzaiolo definePizzaiolo(int ordem){
        if(ordem ==1){
            return new PizzaioloBrasileiro();
        }
        return new PizzaioloItaliano();
    }
    
}
