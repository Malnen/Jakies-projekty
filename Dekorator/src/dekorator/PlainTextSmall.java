package dekorator;

public class PlainTextSmall extends PlainTextDecorator {

    PlainTextSmall(PlainText pt) {
        super(pt, "small");
    }

    @Override
    public void write() {
        super.write();
    }
}
