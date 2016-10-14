package exemplos.patterns.iterator;

import java.util.LinkedList;

/**
 *
 * @author cristianocamilo
 */
public class ExemploIterator {
    
    
    public static void main(String[] args) {
        NameRepository nomes = new NameRepository();
        Iterator<String> it = nomes.getIterator();
        while(it.possuiProximo()){
            System.out.println( it.proximo() );
        }
        
        LinkedList lista = new LinkedList();
        lista.add("sasasa");lista.add("sasasa");lista.add("sasasa");
        java.util.Iterator it2 = lista.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
            
        }
        for(Object obj : lista){
            System.out.println(obj);
        }
    }
    
}
