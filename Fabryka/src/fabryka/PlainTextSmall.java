
package fabryka;


public class PlainTextSmall extends PlainText{

    public PlainTextSmall(String text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.print("<small>");
        System.out.print(text);
        System.out.println("</small>");}
    
}
