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
public class MusicaDecorator implements MusicaInfantil{
    
    private MusicaInfantil musica;
    
    public MusicaDecorator(MusicaInfantil musica){
        this.musica = musica;
    }
    
    @Override
    public String retonarMusica() {
        return this.musica.retonarMusica();
    }

    public MusicaInfantil getMusica() {
        return musica;
    }
    
    
    
}
