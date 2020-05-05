package dekorator;

public class SimplePlainText extends PlainText {

    public SimplePlainText(String s) {
        text = s;
    }

    public void write() {
        System.out.println(text);
    }
}
