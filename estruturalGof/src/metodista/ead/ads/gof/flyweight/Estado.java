package metodista.ead.ads.gof.flyweight;

import java.util.List;

/**
 *
 * @author LuisGustavo
 */
public class Estado {
    
    private String abreviacao;
    private String nome;
    private List<Cidade>cidades;

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    
    
    
}
