
package obserwator;

import java.util.ArrayList;

public class CzujnikTemperatury {
    
    private double temperatura;
    
    public void ustaw(double temperatura){
        this.temperatura = temperatura;
        notifyObservers();
    }
    public void add(Observer o){
        observers.add(o);
    }
    public void remove(Observer o){
        observers.remove(o);
    }
    public void clear(Observer o){
        observers.clear();
    }
    public void notifyObservers(){
        for(Observer o : observers){
            o.update(this);
        }
    }
    public double getTemperatura(){
        return temperatura;
    }
    
    
    protected ArrayList<Observer> observers = new ArrayList();
}
