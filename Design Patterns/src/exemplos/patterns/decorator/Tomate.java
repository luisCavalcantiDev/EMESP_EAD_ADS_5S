package exemplos.patterns.decorator;

/**
 *
 * @author cristianocamilo
 */
public class Tomate extends IngredienteDecorador{

    public Tomate(Lanche lanche) {
        super(lanche);
    }
    
    public double getPreco() {
        return this.getLanche().getPreco() + 0.8 ;
    }
    
}
