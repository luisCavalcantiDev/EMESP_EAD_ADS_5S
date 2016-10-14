package metodista.ead.ads5.patterns.proxy;

/**
 *
 * @author LuisGustavo
 * RealSubject
 */
public class WebServiceAutenticacao implements Autenticacao{

    @Override
    public Boolean efetuarLogin(String usuario, String senha) {
        //Efetuar comunicação com webService para autenticar usuário
        return (true);
    }

    @Override
    public Boolean validarAcesso(String usuario) {
        //efetuar comunicação com webService para liberar acesso requisitado
        return (true);
    }
    
}
