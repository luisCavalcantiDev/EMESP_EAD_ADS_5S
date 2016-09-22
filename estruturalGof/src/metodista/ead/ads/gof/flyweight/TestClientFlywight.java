package metodista.ead.ads.gof.flyweight;

/**
 *
 * @author LuisGustavo
 */
public class TestClientFlywight {

    public static void main(String[] args) {

        FlyweightFactory _factory = new FlyweightFactory();

        Estado estado = _factory.pegarEstado("SP", "São Paulo");
        Cidade cidade = _factory.pegarCidade("Barueri", estado);
        Bairro bairro = _factory.pegarBairro("Consolação", cidade);
        
        

    }

}
