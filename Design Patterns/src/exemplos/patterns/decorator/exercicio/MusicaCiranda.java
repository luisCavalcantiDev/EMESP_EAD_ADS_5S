/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.decorator.exercicio;

/**
 *
 * @author cristianocamilo
 */
public class MusicaCiranda implements MusicaInfantil{
    
        private String letra  = "Ciranda cidandinha vamos todos cirandar";

    @Override
    public String retonarMusica() {
        return letra;
    }
    
}
