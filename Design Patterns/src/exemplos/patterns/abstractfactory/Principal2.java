package exemplos.patterns.abstractfactory;

/**
 *
 * @author cristianocamilo
 */
public class Principal2 {

    public static void main(String[] args) {
        Carro carro = produzirCarro("econo");
        System.out.println(carro);
    }

    private static Carro produzirCarro(String tipo) {
        CarroFactory cf = new CarroPopularFactory();
        if("top".equals(tipo)){
            cf = new CarroTopFactory();
        } else if("econo".equals(tipo)){
            cf = new CarroEconomicoFactory();
        }
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }
    
}
