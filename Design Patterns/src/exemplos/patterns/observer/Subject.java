package exemplos.patterns.observer;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author cristianocamilo
 */
public abstract class Subject {
    
    private List<Observer> observers; 

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }
    
    public void registrar(Observer obs){
        observers.add(obs);
    }
    
    public void notificarATodos(){
        for (Observer observer : observers) {
            observer.notificar();
        }
    }
    
}
