/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.facade;

/**
 *
 * @author cristianocamilo
 */
public class AutenticaBancoDeDados {
    
    public boolean autenticarNoBanco(String user, String pass){
        // fui no banco
        return "eu".equals(user) && "mesmo".equals(pass);
    }
    
}
