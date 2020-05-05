package dekorator;

public class PlainTextP extends PlainTextDecorator {

    PlainTextP(PlainText pt) {
        super(pt);
    }

    @Override
    public void write() {
        System.out.print("<p>");
        super.write();       
        System.out.print("</p>");
    }
}
