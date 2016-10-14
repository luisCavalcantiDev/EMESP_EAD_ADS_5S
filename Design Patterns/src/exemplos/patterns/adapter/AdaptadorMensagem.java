/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.adapter;

import java.util.Date;

/**
 *
 * @author cristianocamilo
 */
public class AdaptadorMensagem implements Email{

    private MensagemPersonalizada mensagem;
    
    public AdaptadorMensagem(){
        this.mensagem = new MensagemPersonalizada();
    }
    
    @Override
    public void enviarEmail(String origem, String destino, 
              String mensagem, Date data) {
        this.mensagem.mensagemComPapelDeParede(origem, destino, 
                mensagem, data, "padrao");
    }
    
}
