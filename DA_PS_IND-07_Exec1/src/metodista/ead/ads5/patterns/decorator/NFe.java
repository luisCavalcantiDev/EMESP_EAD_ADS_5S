package metodista.ead.ads5.patterns.decorator;

/**
 *
 * @author luis.pereira
 */
public class NFe extends DocumentoFiscal {

    private String chaveAcesso;

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    @Override
    public void gerarNotaFiscalEletronica() {
        System.out.println("Nota Fiscal Eltrônica transmitida - Nº: " + this.getNumero()
                + " - Série: " + this.getSerie()
                + " - Valor: " + this.getValor());

        this.chaveAcesso = this.getNumero() + "0000" + this.getSerie() + "0000000";

        System.out.println("Chave de Acesso: " + this.getChaveAcesso());
    }
}
