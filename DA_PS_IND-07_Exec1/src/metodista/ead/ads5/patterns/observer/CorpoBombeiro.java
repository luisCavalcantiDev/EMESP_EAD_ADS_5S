package metodista.ead.ads5.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis.pereira
 */
public class CorpoBombeiro implements TelefoneEmergencia {

    private final List<Sirene> emergencias;
    private final List<String> chamados;

    public CorpoBombeiro() {
        emergencias = new ArrayList<>();
        chamados = new ArrayList<>();
    }

    public void receberChamado(String chamado) {
        chamados.add(chamado);
        this.acionar();
    }

    @Override
    public void adicionarEmergencia(Sirene sirene) {
        emergencias.add(sirene);
    }

    @Override
    public void removerEmergencia(Sirene sirene) {
        int index = emergencias.indexOf(sirene);
        if (index >= 0) {
            emergencias.remove(sirene);
        }
    }

    @Override
    public void acionar() {
        int indexUltimoChamado = chamados.size() - 1;

        for (Sirene sireneEmergencia : emergencias) {
            sireneEmergencia.tocarSirene(chamados.get(indexUltimoChamado));
        }
    }

}
