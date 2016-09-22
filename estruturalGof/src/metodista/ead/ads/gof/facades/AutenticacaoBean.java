package metodista.ead.ads.gof.facades;

/**
 *
 * @author luis.pereira
 */
public class AutenticacaoBean implements Autenticacao {

    @Override
    public Usuario autenticar(String usuario, String senha, Long sistema) {
        return (new UsuarioDAO()).consultarUsuario(usuario, senha, sistema);
    }

    @Override
    public Perfil consultarPerfilUsuario(Long idUsuario) {
        return (new PerfilDAO()).consultarPerfil(idUsuario);
    }
}
