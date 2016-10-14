package exemplos.patterns.abstractfactory;

/**
 *
 * @author cristianocamilo
 */
public interface CarroFactory {
    
    public Roda montarRoda();
    
    public Som montarSom();
    
     public Carro montarCarro();
    
}
