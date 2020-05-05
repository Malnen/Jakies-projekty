package dekorator;

public abstract class PlainText {

    public PlainText(String text){
        this.text = text;
    }
    public abstract void write();

    protected String text;
}
