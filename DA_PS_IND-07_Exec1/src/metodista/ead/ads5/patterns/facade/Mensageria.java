package metodista.ead.ads5.patterns.facade;

/**
 *
 * @author LuisGustavo
 */
public interface Mensageria {
    
    void transmitirNFe(String xml);
    
    Boolean obterRetorno(String lote);
    
}
