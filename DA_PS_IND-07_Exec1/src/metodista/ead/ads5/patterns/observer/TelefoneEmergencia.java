package metodista.ead.ads5.patterns.observer;

/**
 *
 * @author luis.pereira
 */
public interface TelefoneEmergencia {

    void adicionarEmergencia(Sirene sirene);

    void removerEmergencia(Sirene sirene);

    void acionar();

}
