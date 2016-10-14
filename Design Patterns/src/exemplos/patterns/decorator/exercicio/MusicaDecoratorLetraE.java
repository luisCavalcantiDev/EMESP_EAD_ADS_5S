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
public class MusicaDecoratorLetraE extends MusicaDecorator{
    
    private char letraMin = 'e', letraMai = 'E';
    
    public MusicaDecoratorLetraE(MusicaInfantil musica) {
        super(musica);
    }
    
    @Override
    public String retonarMusica() {
        return super.getMusica().retonarMusica()
                .replace('a', letraMin)
                .replace('e', letraMin)
                .replace('i', letraMin)
                .replace('o', letraMin)
                .replace('u', letraMin)
                .replace('A', letraMai)
                .replace('E', letraMai)
                .replace('I', letraMai)
                .replace('O', letraMai)
                .replace('U', letraMai);
    }
    
    
}
