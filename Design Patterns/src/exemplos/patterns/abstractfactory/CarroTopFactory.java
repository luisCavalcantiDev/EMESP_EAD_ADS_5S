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
public class CarroTopFactory implements CarroFactory{

    public Roda montarRoda() {
        return new RodaDeLigaLeve();
    }

    public Som montarSom() {
        return new DVDPlayer();
    }
    
    public Carro montarCarro(){
        Carro car = new Carro();
        car.setRoda(this.montarRoda());
        car.setSom(this.montarSom());
        return car;
    }
}
