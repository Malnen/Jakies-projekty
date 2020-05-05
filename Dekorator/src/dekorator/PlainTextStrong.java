package dekorator;

public class PlainTextStrong extends PlainTextDecorator {

    PlainTextStrong(PlainText pt) {
        super(pt);
    }

    @Override
    public void write() {
        System.out.print("<strong>");
        super.write();       
        System.out.print("</strong>");
    }
}
