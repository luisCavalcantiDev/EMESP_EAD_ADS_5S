package metodista.ead.ads.gof.decorators;

/**
 *
 * @author luis.pereira
 */
public abstract class SorveteSabor extends Sorvete{
    
    private Sorvete sorvete;
    
    public SorveteSabor(Sorvete sorvete){
        this.sorvete = sorvete;
        this.setNome(sorvete.getNome());
    }

    public Sorvete getSorvete() {
        return sorvete;
    }        
    
}
