package exemplos.patterns.facade;

import java.util.Scanner;

/**
 *
 * @author cristianocamilo
 */
public class TesteFacade {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Diite seu usuário : ");
        String user = tec.next();
        System.out.println("Digite sua senha: ");
        String senha = tec.next();
        
        Autenticador aut = new AutenticadorFacade();
        boolean resp = aut.autenticarUsuario(user, senha);
        System.out.println("Usuario " + 
                (resp?" logado":" não logado"));
        
    }
    
}
