
package dekorator;

public class PlainTextEm extends PlainTextDecorator{
    PlainTextEm(PlainText pt){
        super(pt, "em");
    }
    @Override
    public void write(){
        super.write();
    }
}
