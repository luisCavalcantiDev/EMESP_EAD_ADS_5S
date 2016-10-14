package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author cristianocamilo
 */
public class Smart extends Carro{
    
    public Smart(){
        super(new Trnasportar2Pessoas(),"Smart");
    }
    
}
