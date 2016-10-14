package metodista.ead.ads5.patterns.decorator;

/**
 *
 * @author luis.pereira
 */
public class TestClientNFe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criação de documento: NF-e
        NFe documento = new NFe();
        
        documento.setNumero("1234");
        documento.setSerie("999");
        documento.setValor(500.00);
        
        //Geração de NF-e - transmitir para a Sefaz
        documento.gerarNotaFiscalEletronica();
        
        System.out.println("Decorator EmissaoNFe----------------------------------------------------");
        
        //Necessário adicionar funcionalidade: armazenar XML (chama Decorator EmissaoNFe)
        EmissaoNFe emissaoNFe = new EmissaoNFe(documento);
        emissaoNFe.gerarNotaFiscalEletronica();
        
        System.out.println("Decorator ImpressaoDanfe----------------------------------------------------");
        
        //Necessário adicionar funcionalidade: imprimir DANFE (chama Decorator ImpressaoDanfe)
        ImpressaoDanfe impressaoDanfe = new ImpressaoDanfe(documento);        
        impressaoDanfe.gerarNotaFiscalEletronica();
        
    }
    
}
