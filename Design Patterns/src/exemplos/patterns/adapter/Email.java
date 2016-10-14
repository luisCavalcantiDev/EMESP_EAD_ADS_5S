package exemplos.patterns.adapter;

import java.util.Date;

/**
 *
 * @author cristianocamilo
 */
public interface Email {
    
    public void enviarEmail(String origem, String destino, 
            String mensagem, 
            Date data);
    
}
