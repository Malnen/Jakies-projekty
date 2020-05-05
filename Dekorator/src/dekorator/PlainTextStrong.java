package dekorator;

public class PlainTextStrong extends PlainTextDecorator {

    PlainTextStrong(PlainText pt) {
        super(pt, "strong");
    }

    @Override
    public void write() {
        super.write();
    }
}
