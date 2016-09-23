package metodista.ead.ads5.patterns.strategy;

/**
 *
 * @author LuisGustavo
 */
public class NotaFiscalSaoPaulo implements NotaFiscalServico {

    private final String numero;
    private final String serie;
    private final double valor;
    private final String descricaoServico;

    public NotaFiscalSaoPaulo(String numero, String serie, double valor, String descricaoServico) {
        this.numero = numero;
        this.serie = serie;
        this.valor = valor;
        this.descricaoServico = descricaoServico;
    }

    @Override
    public void gerarNotaFiscal() {
        System.out.println("NFS-e via WebService.... transmitindo...");

        System.out.println("NFS-e São Paulo gerada: Nº - " + this.numero + ", Série - "
                + this.serie + ", Valor - " + this.valor + ", Descrição Serviço - "
                + this.descricaoServico);
    }

}
