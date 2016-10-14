package exemplos.patterns.builder;

/**
 *
 * @author cristianocamilo
 */
public class Computador {
    
    private int memoria;
    private String processador;
    private int hd;
    private boolean bluetooth = false;
    private int anosGarantia = 0;
    private String sistemaOperacional = "dos";
    private boolean possuiTouchScreen = false;

    public Computador(int memoria, String processador, int hd) {
        this.memoria = memoria;
        this.processador = processador;
        this.hd = hd;
    }
    
    public Computador configSistema(String sistema){
        this.sistemaOperacional = sistema;
        return this;
    }
    
    public Computador configAnosGarantia(int anos){
        this.anosGarantia = anos;
        return this;
    }
    
    public Computador configTouch(boolean tipo){
        this.possuiTouchScreen = tipo;
        return this;
    }
    
    
    
}
