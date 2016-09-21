package metodista.ead.ads.gof.decorators;

/**
 *
 * @author luis.pereira
 */
public class Chocolate extends SorveteSabor{
    
    public Chocolate(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + this.getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
        return 1.50 + this.getSorvete().getPreco();
    }
    
}
