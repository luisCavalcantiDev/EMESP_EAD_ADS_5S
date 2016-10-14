package metodista.ead.ads5.patterns.strategy;

/**
 *
 * @author LuisGustavo
 */
public class EmissaoNFSe {

    private NotaFiscalServico objNFSe;

    public EmissaoNFSe() {
    }

    public void registrarPrefeitura(NotaFiscalServico notaFiscalServico) {
        this.objNFSe = notaFiscalServico;
    }

    public void emitirNotaFiscal() {
        this.objNFSe.gerarNotaFiscal();
    }

}
