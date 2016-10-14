package metodista.ead.ads5.patterns.facade;

/**
 *
 * @author LuisGustavo
 */
public class Sefaz implements Mensageria{
    
    private final String UF;
    
    public Sefaz(String UF){
        this.UF = UF;
    }

    @Override
    public void transmitirNFe(String xml) {
        //transmitir NFe para webService da UF Sefaz
    }

    @Override
    public Boolean obterRetorno(String lote) {
        return true; //lote autorizado
    }
    
}
