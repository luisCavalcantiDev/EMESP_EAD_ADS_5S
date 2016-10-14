package metodista.ead.ads5.patterns.proxy;

/**
 *
 * @author LuisGustavo
 * (Subject)
 */
public interface Autenticacao {
    
    public Boolean efetuarLogin(String usuario, String senha);
    
    public Boolean validarAcesso(String usuario);
    
}
