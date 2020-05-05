package dekorator;

public class PlainTextDecorator extends PlainText {

    PlainTextDecorator(PlainText pt) {
        super(pt.text);
        this.pt = pt;
    }

    @Override
    public void write() {
        pt.write();
    }

    protected PlainText pt;
}
