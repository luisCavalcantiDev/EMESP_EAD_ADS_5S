package metodista.ead.ads.gof.brigde;

/**
 *
 * @author luis.pereira
 */
public class TestClientBrigde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Computador computador;

        //Brigdes em Computador - desacoplamento das abstrações das implementações;
        //Poderia ter outros tipos de memória e computador, classes não seriam afetadas
        computador = new Notebook();
        computador.setMemoria(new DDR2());
        computador.setProcessador(new Pentium4());
    }

}
