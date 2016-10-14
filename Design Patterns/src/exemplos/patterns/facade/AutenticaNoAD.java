package exemplos.patterns.facade;

/**
 *
 * @author cristianocamilo
 */
public class AutenticaNoAD {
    
    public int autenticaNoAd(String user, String pass){
        // Acessou o AD
        if( "eu".equals(user) && "mesmo".equals(pass)){
            return 1;
        }
        return 0;
    }
    
}
