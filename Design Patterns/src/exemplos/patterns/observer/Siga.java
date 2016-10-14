/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.observer;

/**
 *
 * @author cristianocamilo
 */
public class Siga extends Subject{
    
    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
        super.notificarATodos();
    }
    
}
