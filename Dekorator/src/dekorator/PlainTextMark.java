package dekorator;

public class PlainTextMark extends PlainTextDecorator {

    PlainTextMark(PlainText pt) {
        super(pt, "mark");
    }

    @Override
    public void write() {
        super.write();
    }
}
