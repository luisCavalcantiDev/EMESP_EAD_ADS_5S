package metodista.ead.ads5.patterns.observer;

/**
 *
 * @author LuisGustavo
 */
public class TestClientObserver {
    
    public static void main(String[] args) {
        
        CorpoBombeiro bombeiro = new CorpoBombeiro();
        
        Sirene bombeiroPlantao1 = new Bombeiro("José da Silva", bombeiro);
        Sirene bombeiroPlantao2 = new Bombeiro("Paulo Duarte", bombeiro);
        Sirene bombeiroPlantao3 = new Bombeiro("Manoel", bombeiro);
        
        bombeiro.receberChamado("Incêndio na Av. Paulista nº 789 (perto da Consolação)");
        
        Sirene bombeiroPlantao4 = new Bombeiro("Barreto", bombeiro);
        
        bombeiro.receberChamado("Ocorrência incêndio Centro SP");
        
    }
    
}
