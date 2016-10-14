package exemplos.patterns.adapter;

import java.util.Date;

/**
 *
 * @author cristianocamilo
 */
public class EmailPadrao implements Email{

    @Override
    public void enviarEmail(String origem, String destino, 
            String mensagem, Date data) {
        System.out.println("Enviando e-mail padrao de " + origem
                + " PARA " +  destino 
                + " EM " + data.toString()
                + " MENSAGEM : " + mensagem
        );
    }
    
}
