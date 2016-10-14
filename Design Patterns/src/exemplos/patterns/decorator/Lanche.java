package exemplos.patterns.decorator;

/**
 *
 * @author cristianocamilo
 */
public abstract class Lanche {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double getPreco();
    
}
