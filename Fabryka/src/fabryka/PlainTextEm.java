
package fabryka;


public class PlainTextEm extends PlainText {

    public PlainTextEm(String text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.print("<em>");
        System.out.print(text);
        System.out.println("</em>");    }
    
}
