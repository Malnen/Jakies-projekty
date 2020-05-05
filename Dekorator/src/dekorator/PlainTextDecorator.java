package dekorator;

public class PlainTextDecorator extends PlainText {

    PlainTextDecorator(PlainText pt, String s) {
        this.pt = pt;
        addFormat(s);
    }

    @Override
    public void write() {
        pt.write();
    }

    public void addFormat(String s) {
        pt.text = "<" + s + ">" + pt.text + "</" + s + ">";
    }

    protected PlainText pt;
}
