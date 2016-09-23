package metodista.ead.ads5.patterns.proxy;

/**
 *
 * @author LuisGustavo
 * (Proxy)
 */
public class AutenticacaoProxy implements Autenticacao {

    private final Autenticacao wsAutenticacao = new WebServiceAutenticacao();

    @Override
    public Boolean efetuarLogin(String usuario, String senha) {
        return wsAutenticacao.efetuarLogin(usuario, senha);
    }

    @Override
    public Boolean validarAcesso(String usuario) {
        return wsAutenticacao.validarAcesso(usuario);
    }

}
