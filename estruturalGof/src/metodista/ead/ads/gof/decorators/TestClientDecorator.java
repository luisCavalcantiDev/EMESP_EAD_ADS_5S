package metodista.ead.ads.gof.decorators;

/**
 *
 * @author luis.pereira
 */
public class TestClientDecorator {


    public static void main(String[] args) {
        
        Sorvete sorvete = new SorveteNapolitano();
        
        //Inicial
        retornaInformacoes(sorvete);
        
        //Adiciona funcionalidade
        sorvete = new Creme(sorvete);
        sorvete = new Chocolate(sorvete);
        sorvete = new Morango(sorvete);
        
        retornaInformacoes(sorvete);
    }
    
    public static void retornaInformacoes(Sorvete sorvete){
        System.out.println(sorvete.getNome() + " - " + sorvete.getQuantidadeBolas() + " preço : " + sorvete.getPreco());
    }
    
}
