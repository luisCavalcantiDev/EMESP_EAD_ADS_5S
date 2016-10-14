package exemplos.patterns.strategy.exemplo2;

/**
 *
 * @author cristianocamilo
 */
public class Calculadora {
    
    private Operacao operacao;
    
    public Calculadora defineOperacao(Operacao operacao){
        this.operacao = operacao;
        return this;
    }
    
    public double retornaOperacao(double n1, double n2){
        return operacao.realizarOperacao2Numeos(n1, n2); 
    }
    
}
