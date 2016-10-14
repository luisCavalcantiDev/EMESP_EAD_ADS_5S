package exemplos.patterns.abstractfactory;

/**
 *
 * @author cristianocamilo
 */
public class Carro {
    
    private Som som;
    private Roda roda;

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }
    
    public String toString(){
        return this.roda.toString() + " - " +
                this.som.toString();
    }
    
}
