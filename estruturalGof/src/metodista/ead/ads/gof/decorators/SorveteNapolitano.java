package metodista.ead.ads.gof.decorators;

/**
 *
 * @author luis.pereira
 */
public class SorveteNapolitano extends Sorvete{
    
    public SorveteNapolitano(){
        this.setNome("Sorvete Napolitado");
    }

    @Override
    public int getQuantidadeBolas() {
        return 0;
    }

    @Override
    public double getPreco() {
        return 2.50;
    }
}
