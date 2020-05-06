
package fabryka;

public class PlainTextP extends PlainText{

    public PlainTextP(String text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.print("<p>");
        System.out.print(text);
        System.out.println("</p>");    }
    
}
