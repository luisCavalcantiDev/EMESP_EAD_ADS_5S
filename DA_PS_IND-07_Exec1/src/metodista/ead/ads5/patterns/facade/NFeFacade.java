package metodista.ead.ads5.patterns.facade;

/**
 *
 * @author LuisGustavo
 */
public class NFeFacade {
    
    private static final NFeFacade instance = new NFeFacade();
    
    private NFeFacade(){
    }
    
    public static NFeFacade getInstance(){
        return instance;
    }
    
    public void emitirNFe(NotaFiscal notaFiscal, String UF){
        
        NFe310 nfe = new GeradorNFe();
        String xml = nfe.criarXml(notaFiscal);
        

        Mensageria sefaz = new Sefaz(UF);
        sefaz.transmitirNFe(xml);
        
        Boolean retorno = sefaz.obterRetorno("123456");
    }
    
}
