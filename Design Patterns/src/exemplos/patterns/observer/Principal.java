package exemplos.patterns.observer;

/**
 *
 * @author cristianocamilo
 */
public class Principal {

    public static void main(String[] args) {
        Siga siga = new Siga();
        Aluno a1 = new Aluno(siga,"Gabriel");
        Aluno a2 = new Aluno(siga, "Gustavo");
        Aluno a3 = new Aluno(siga, "Igor");
        siga.setNota(5);
        System.out.println("Definida nota 1");
        
        siga.registrar(a1);
        
        siga.setNota(6);
        System.out.println("Definida nota 2");
        
        siga.registrar(a2);
        siga.registrar(a3);
        siga.setNota(7);
        System.out.println("Definida nota 3");
        System.out.println("FIM");
    }
        
}
