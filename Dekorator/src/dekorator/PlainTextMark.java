package dekorator;

public class PlainTextMark extends PlainTextDecorator {

    PlainTextMark(PlainText pt) {
        super(pt);
    }

    @Override
    public void write() {
        System.out.print("<mark>");
        super.write();       
        System.out.print("</mark>");
    }
}
