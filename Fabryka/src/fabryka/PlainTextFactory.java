package fabryka;

public class PlainTextFactory {

    public static PlainText createPlainText(PlainText pt, String type) {
        if (type.equals("p")) {
            return new PlainTextP(pt.text);
        } else if (type.equals("em")) {
            return new PlainTextEm(pt.text);
        } else if (type.equals("small")) {
            return new PlainTextSmall(pt.text);
        } else if (type.equals("strong")) {
            return new PlainTextStrong(pt.text);
        } else if (type.equals("mark")) {
            return new PlainTextMark(pt.text);
        } else {
            throw new IllegalArgumentException("Nieznany typ " + type);
        }
    }

}
