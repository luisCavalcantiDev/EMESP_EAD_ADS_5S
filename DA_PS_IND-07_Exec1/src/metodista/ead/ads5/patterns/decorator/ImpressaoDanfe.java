package metodista.ead.ads5.patterns.decorator;

public class ImpressaoDanfe extends NFe {

    private final NFe doctoNFe;

    public ImpressaoDanfe(NFe doctoNFe) {
        this.doctoNFe = doctoNFe;
    }

    @Override
    public void gerarNotaFiscalEletronica() {

        System.out.println("Nota Fiscal Eltrônica - DANFE impresso. [Chave de Acesso: " + this.doctoNFe.getChaveAcesso());
    }
}
