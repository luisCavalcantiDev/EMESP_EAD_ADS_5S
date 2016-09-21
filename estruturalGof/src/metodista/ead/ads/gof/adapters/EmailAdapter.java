package metodista.ead.ads.gof.adapters;

import java.util.Date;

/**
 *
 * @author luis.pereira
 */
public class EmailAdapter implements Email{

    @Override
    public void enviarEmail(String orig, String dest, String msg, Date data) {
        (new EmailPersonalizado()).enviarEmailComPapelDeParede(orig, dest, msg, data);
    }
    
    
}
