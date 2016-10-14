/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.builder;

/**
 *
 * @author cristianocamilo
 */
public class Principal {
    
    
    public static void main(String[] args) {
        Computador comp = new Computador(8, "Core 2 DUO", 250);
        // Forma 1
        Computador comp2 = new Computador(8, "Core 2 DUO", 250).configSistema("Windows");
        // Forma 2
        Computador comp3 = new Computador(8, "Core 2 DUO", 250);
        comp3 = comp3.configSistema("Windows");
        // Forma 3
        Computador comp4 = new Computador(8, "Core 2 DUO", 250)
                           .configAnosGarantia(3)
                           .configSistema("MacOS");
        
        
        Computador comp5 = new Computador(8, "Core 2 DUO", 250)
                           .configAnosGarantia(3)
                           .configSistema("MacOS")
                            .configTouch(true);
        
        
        
 
    }
    
}
