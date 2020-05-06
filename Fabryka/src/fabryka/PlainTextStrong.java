
package fabryka;

public class PlainTextStrong extends PlainText{

    public PlainTextStrong(String text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.print("<strong>");
        System.out.print(text);
        System.out.println("</strong>");  }
    
}
