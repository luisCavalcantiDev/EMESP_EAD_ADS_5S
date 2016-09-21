
package metodista.ead.ads.gof.brigde;

/**
 *
 * @author luis.pereira
 */
public class DDR2 implements Memoria{
    
    private double velocidade;

    public DDR2() {
        this.velocidade = 56.563;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }        
}
