package metodista.ead.ads.gof.facades;

/**
 *
 * @author luis.pereira
 */
public interface Autenticacao {
    
    Usuario autenticar(String usuario, String senha, Long sistema);
    
    Perfil consultarPerfilUsuario(Long idUsuario);
    
}
