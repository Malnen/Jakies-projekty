
package kompozyt;

public class File extends BaseClass {
    public File(String name, String type){
        super(name,type);
    }
    @Override
    public void dir(){
        System.out.println("  " + name + "." + type);
    }

}
