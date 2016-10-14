package metodista.ead.ads5.patterns.facade;

/**
 *
 * @author LuisGustavo
 */
public class GeradorNFe implements NFe310{

    @Override
    public String criarXml(NotaFiscal notaFiscal) {
        //Implementa montagem do XML da NF-e versão 3.10
        return "<nfe></nfe>";
    }       
}
