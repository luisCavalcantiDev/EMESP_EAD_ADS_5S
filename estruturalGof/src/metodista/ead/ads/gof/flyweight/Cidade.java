package metodista.ead.ads.gof.flyweight;

import java.util.List;

/**
 *
 * @author LuisGustavo
 */
public class Cidade {
    
    private String nome;
    private Estado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }
    private List<Bairro>bairros;
}
