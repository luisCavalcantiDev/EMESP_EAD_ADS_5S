package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author cristianocamilo
 */
public class Principal {
    
    public static void main(String[] args) {
        Carro car = new Uno();
        Carro car2 = new Gol();
        Carro car3 = new Smart();
        Carro car4 = new Zafira();
        car.transportarPessoas();
        car2.transportarPessoas();
        car3.transportarPessoas();
        car4.transportarPessoas();
    }
    
}
