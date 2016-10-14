package metodista.ead.ads5.patterns.decorator;

import java.util.Date;



/**
 *
 * @author luis.pereira
 */
public abstract class DocumentoFiscal{
  
    private String numero;
    private String serie;
    private Date dataEmissao;
    private double valor;
    
    public abstract void gerarNotaFiscalEletronica();
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
