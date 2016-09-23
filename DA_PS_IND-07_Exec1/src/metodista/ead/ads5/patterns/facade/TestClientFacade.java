package metodista.ead.ads5.patterns.facade;

import java.util.Calendar;

/**
 *
 * @author LuisGustavo
 */
public class TestClientFacade {

    public static void main(String[] args) {

        NotaFiscal notaFiscal = new NotaFiscal();

        notaFiscal.setNumero("123456");
        notaFiscal.setDataEmissao(Calendar.getInstance().getTime());
        notaFiscal.setTotal(500.00);

        NFeFacade.getInstance().emitirNFe(notaFiscal, "SP");

    }

}
