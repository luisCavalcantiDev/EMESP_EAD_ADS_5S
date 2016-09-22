package metodista.ead.ads.gof.flyweight;

/**
 *
 * @author LuisGustavo
 */
public class Endereco {
    
    private String logradouro;
    private Bairro bairro;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    
    
}
