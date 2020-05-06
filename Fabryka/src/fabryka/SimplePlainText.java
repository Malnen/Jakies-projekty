package fabryka;

public class SimplePlainText extends PlainText {

    public SimplePlainText(String text) {
        super(text);
    }

    @Override
    public void print() {
        System.out.println(text);
    }

}
