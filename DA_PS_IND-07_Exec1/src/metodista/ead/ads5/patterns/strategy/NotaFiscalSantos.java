package metodista.ead.ads5.patterns.strategy;

/**
 *
 * @author LuisGustavo
 */
public class NotaFiscalSantos implements NotaFiscalServico {

    private final String numero;
    private final String serie;
    private final double valor;
    private final Boolean impostoRetido;

    public NotaFiscalSantos(String numero, String serie, double valor, Boolean impostoRetidoBoolean) {
        this.numero = numero;
        this.serie = serie;
        this.valor = valor;
        this.impostoRetido = impostoRetidoBoolean;
    }

    @Override
    public void gerarNotaFiscal() {
        System.out.println("NFS-e via TXT....gerando arquivo RPS...");

        System.out.println("NFS-e Santos gerada: Nº - " + this.numero + ", Série - "
                + this.serie + ", Valor - " + this.valor + ", Imposto Retido? "
                + (this.impostoRetido ? "Sim" : "Não"));
    }

}
