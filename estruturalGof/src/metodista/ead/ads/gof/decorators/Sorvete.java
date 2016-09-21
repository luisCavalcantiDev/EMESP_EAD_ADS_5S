package metodista.ead.ads.gof.decorators;

/**
 *
 * @author luis.pereira
 */
public abstract class Sorvete {
    
    private String nome;
    
    public abstract int getQuantidadeBolas();
    
    public abstract double getPreco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
