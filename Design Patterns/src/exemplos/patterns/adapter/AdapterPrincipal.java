package exemplos.patterns.adapter;

/**
 *
 * @author cristianocamilo
 */
public class AdapterPrincipal {
    
    public static void main(String[] args) {
        Email mail = new AdaptadorMensagem();
        mail.enviarEmail("de", "para", "oi", new java.util.Date());
        String[][] t = {{"a","a"},{"s","a"},{"d","a"}};
    }
    
}
