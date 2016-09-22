package metodista.ead.ads.gof.facades;

/**
 *
 * @author luis.pereira
 */
public class TestClientFacade {


    public static void main(String[] args) {
        
        //Autenticacao do Usuario (acesso a subSistemas atavés do Facade)
        Autenticacao autenticacao = new AutenticacaoBean();
        
        Usuario usuario = autenticacao.autenticar("user", "1234", Long.MIN_VALUE);
        Perfil perfil = autenticacao.consultarPerfilUsuario(Long.MIN_VALUE);
    }
    
}
