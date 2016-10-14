package exemplos.patterns.decorator;

/**
 *
 * @author cristianocamilo
 */
public class Alface extends IngredienteDecorador{

    public Alface(Lanche lanche) {
        super(lanche);
    }

    public double getPreco() {
        return this.getLanche().getPreco() + 0.3;
    }

}
