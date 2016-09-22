package metodista.ead.ads.gof.flyweight;

import java.util.Map;

/**
 *
 * @author LuisGustavo
 */
public class FlyweightFactory {

    private Map<String, Estado> estados;
    private Map<String, Cidade> cidades;
    private Map<String, Bairro> bairros;
    
    public Estado pegarEstado(String abreviacao, String nome){
        return null; //TODO
    }
    
    public Cidade pegarCidade(String nome, Estado estado){
        return null; //TODO
    }
    
    public Bairro pegarBairro(String nome, Cidade cidade){
        return null; //TODO
    }

}
