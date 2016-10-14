package metodista.ead.ads5.patterns.strategy;

/**
 *
 * @author LuisGustavo
 */
public class NotaFiscalSaoBernardo implements NotaFiscalServico {

    private final String numero;
    private final String serie;
    private final double valor;

    public NotaFiscalSaoBernardo(String numero, String serie, double valor) {
        this.numero = numero;
        this.serie = serie;
        this.valor = valor;
    }

    @Override
    public void gerarNotaFiscal() {
        System.out.println("NFS-e via POST.... gerando POST...");

        System.out.println("NFS-e São Bernardo gerada: Nº - " + this.numero + ", Série - "
                + this.serie + ", Valor - " + this.valor);
    }

}
