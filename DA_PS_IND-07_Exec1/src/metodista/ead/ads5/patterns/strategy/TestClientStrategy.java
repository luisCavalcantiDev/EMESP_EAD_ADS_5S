package metodista.ead.ads5.patterns.strategy;

/**
 *
 * @author LuisGustavo
 */
public class TestClientStrategy {
    
    public static void main(String[] args) {
        
        EmissaoNFSe emissor;
        NotaFiscalServico notaFiscalServico;
        
        emissor = new EmissaoNFSe();
        
        notaFiscalServico = new NotaFiscalSaoPaulo("4001", "1", 1000.00, "Desenvolvimento Sistemas");        
        emissor.registrarPrefeitura(notaFiscalServico);
        emissor.emitirNotaFiscal();
        
        notaFiscalServico = new NotaFiscalSantos("58901", "485", 500.00, false);        
        emissor.registrarPrefeitura(notaFiscalServico);
        emissor.emitirNotaFiscal();
        
        notaFiscalServico = new NotaFiscalSaoBernardo("789652", "123", 5000.00);
        emissor.registrarPrefeitura(notaFiscalServico);
        emissor.emitirNotaFiscal();
        
    }
    
}
