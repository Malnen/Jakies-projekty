
package fabryka;


public class PlainTextMark extends PlainText{

    public PlainTextMark(String text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.print("<mark>");
        System.out.print(text);
        System.out.println("</mark>");}
    
}
