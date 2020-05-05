package dekorator;

public class PlainTextP extends PlainTextDecorator {

    PlainTextP(PlainText pt) {
        super(pt, "p");
    }

    @Override
    public void write() {
        super.write();
    }
}
