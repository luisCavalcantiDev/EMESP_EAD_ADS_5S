package exemplos.patterns.observer;

/**
 *
 * @author cristianocamilo
 */
public class Aluno implements Observer{

    private int nota;
    private Siga siga;
    private String nome;

    public Aluno(Siga siga, String nome) {
        this.siga = siga;
        this.nome = nome;
    }
 
    @Override
    public void notificar() {
        System.out.println("Eu sou " + this.nome +" vou olhar o SIGA...");
        this.nota = this.siga.getNota();
        System.out.println("Minha onva nota é... " + this.nota);
    }
    
}
