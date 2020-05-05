package dekorator;

public class SimplePlainText extends PlainText {

    public SimplePlainText(String s) {
        super(s);
    }

    public void write() {
        System.out.print(text);
    }
}
