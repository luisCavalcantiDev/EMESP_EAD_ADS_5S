package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author cristianocamilo
 */
public abstract class Carro {
    
    private FormaTransporte forma;
    private String nome;
    
    public Carro(FormaTransporte forma, String nome){
        this.forma = forma;
        this.nome = nome;
    }
    
    public void transportarPessoas(){
        System.out.println(this.nome + " - " +  forma.moverSe());
    }
    
}
