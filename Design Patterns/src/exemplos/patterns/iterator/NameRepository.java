/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.iterator;

/**
 *
 * @author cristianocamilo
 */
public class NameRepository implements Container{

    private String[][] nomes = {{ "joao" , "carlos", "jose"},
                                { "chica" , "maria", "joana"}};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator<String>{

        private int indice;
        
        @Override
        public boolean possuiProximo() {
            return  (this.indice < ((nomes[1].length)+
                    (nomes[0].length)));
        }

        @Override
        public String proximo() {
            if(indice<nomes[0].length){
                return nomes[0][indice++];
            }
            return nomes[1][-3+indice++];
        }
        
    }
    
}
