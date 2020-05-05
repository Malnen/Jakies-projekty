
package dekorator;

public class PlainTextEm extends PlainTextDecorator{
    PlainTextEm(PlainText pt){
        super(pt);
    }
    @Override
    public void write(){
        System.out.print("<em>");
        super.write();       
        System.out.print("</em>");
    }
}
