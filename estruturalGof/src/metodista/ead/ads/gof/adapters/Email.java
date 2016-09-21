package metodista.ead.ads.gof.adapters;

import java.util.Date;

/**
 *
 * @author luis.pereira
 */
public interface Email {
    
    void enviarEmail(String orig, String dest, String msg, Date data);
    
}
