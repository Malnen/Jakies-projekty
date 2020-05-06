
package fabryka;


public abstract class PlainText {
    
    protected String text;
    
    public PlainText(String text){
        this.text = text;
    }
    
    public abstract void print();
    
}
