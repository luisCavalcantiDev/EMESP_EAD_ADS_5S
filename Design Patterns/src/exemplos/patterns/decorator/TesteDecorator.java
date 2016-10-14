package exemplos.patterns.decorator;

/**
 *
 * @author cristianocamilo
 */
public class TesteDecorator {
    
    public static void main(String[] args) {
        Lanche lanche = new XFrango();
        lanche = new Alface(lanche);
        lanche = new Tomate(lanche);
        lanche = new Bacon(lanche);
        System.out.println("Nóme do lanche: " + lanche.getNome() +
                            " preço = " + lanche.getPreco());
    }
    
}
