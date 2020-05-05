package dekorator;

public class PlainTextSmall extends PlainTextDecorator {

    PlainTextSmall(PlainText pt) {
        super(pt);
    }

    @Override
    public void write() {
        System.out.print("<small>");
        super.write();       
        System.out.print("</small>");
    }
}
