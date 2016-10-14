package exemplos.patterns.abstractfactory;

/**
 *
 * @author cristianocamilo
 */
public class Principal3 {

    public static void main(String[] args) {
        Carro carro = produzirCarro("top");
        System.out.println(carro);
    }

    private static Carro produzirCarro(String tipo) {
        CarroFactory cf = new CarroPopularFactory();
        if("top".equals(tipo)){
            cf = new CarroTopFactory();
        } else if("econo".equals(tipo)){
            cf = new CarroEconomicoFactory();
        }
        Carro carro = cf.montarCarro();
        return carro;
    }
    
}
