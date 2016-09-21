package metodista.ead.ads.gof.adapters;

import java.util.Calendar;

/**
 *
 * @author luis.pereira
 */
public class TestClientAdapter {


    public static void main(String[] args) {
        
        //Exemplo 1
        //Email email = new EmailPersonalizado();
        
        //Adapter
        Email email = new EmailAdapter();
        
        email.enviarEmail("orig", "dest", "msg", Calendar.getInstance().getTime());

    }
    
}
