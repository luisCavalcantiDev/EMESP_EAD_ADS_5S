/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.abstractfactory;

/**
 *
 * @author cristianocamilo
 */
public class CarroEconomicoFactory implements CarroFactory{

    @Override
    public Roda montarRoda() {
        return new RodaDeLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CDPlayer();
    }

    @Override
    public Carro montarCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
