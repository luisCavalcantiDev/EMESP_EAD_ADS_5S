package metodista.ead.ads.gof.brigde;

/**
 *
 * @author luis.pereira
 */
public class Pentium4 implements Processador {
    
    private double velocidade;

    public Pentium4() {
        this.velocidade = 789.65;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
