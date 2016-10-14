package metodista.ead.ads5.patterns.decorator;

/**
 *
 * @author luis.pereira
 */
public class EmissaoNFe extends NFe {

    private final NFe doctoNFe;

    private String xml;

    public String getXml() {
        return xml;
    }

    public EmissaoNFe(NFe doctoNFe) {
        this.doctoNFe = doctoNFe;
    }

    @Override
    public void gerarNotaFiscalEletronica() {
        this.doctoNFe.gerarNotaFiscalEletronica();

        this.xml = "<nfe><numero>" + this.doctoNFe.getNumero() + "</numero><serie>"
                + this.doctoNFe.getSerie() + "</serie><valor>"
                + this.doctoNFe.getValor() + "</valor></nfe>";

        System.out.println("Nota Fiscal Eltrônica com XML armazenado " + this.xml);

    }

}
