package metodista.ead.ads5.patterns.facade;

import java.util.Date;

/**
 *
 * @author LuisGustavo
 */
public class NotaFiscal {

    private String numero;
    private Date dataEmissao;
    private double total;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
