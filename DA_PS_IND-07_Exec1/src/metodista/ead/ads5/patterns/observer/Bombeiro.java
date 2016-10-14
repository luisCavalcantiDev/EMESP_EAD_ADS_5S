package metodista.ead.ads5.patterns.observer;

/**
 *
 * @author luis.pereira
 */
public class Bombeiro implements Sirene {

    private final String nome;

    public Bombeiro(String nome, TelefoneEmergencia bombeiro) {
        this.nome = nome;
        bombeiro.adicionarEmergencia(this);
    }

    @Override
    public void tocarSirene(String chamado) {
        System.out.println("Chamado emergência " + chamado + " - Nome Bombeiro Acionado: " + this.nome);
    }

}
