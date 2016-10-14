/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads5.exec1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author cristianocamilo
 */
public class Principal {

    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar(2015,
                Calendar.MARCH, 22);
        Pizza pizza = PizzaFactory.pedirPizza(cal);
        if (pizza != null) {
            System.out.println(pizza.imprimirIngredientes());
        } else {
            System.out.println("Pizzaria fechada!");
        }
    }

}
