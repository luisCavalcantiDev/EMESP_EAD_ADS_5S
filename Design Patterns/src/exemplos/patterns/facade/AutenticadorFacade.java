package exemplos.patterns.facade;

/**
 *
 * @author cristianocamilo
 */
public class AutenticadorFacade implements Autenticador{

    /*
    @Override
    public boolean autenticarUsuario(String usuario, String senha) {
        AutenticaBancoDeDados abd = new AutenticaBancoDeDados();
        return abd.autenticarNoBanco(usuario, senha);
    }
    */
    
     @Override
    public boolean autenticarUsuario(String usuario, String senha) {
        AutenticaNoAD abd = new AutenticaNoAD();
        return abd.autenticaNoAd(usuario, senha)==1;
    }

    
}
