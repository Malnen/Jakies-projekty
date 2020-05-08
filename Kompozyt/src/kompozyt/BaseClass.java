package kompozyt;

public abstract class BaseClass {

    protected String name;
    protected String type;

    protected Folder parentFolder;

    public BaseClass(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void dir();

    public void displayPath() {
        parentPath(this);
        System.out.print(">");
    }

    protected void parentPath(Object obj) {
        if ((BaseClass) obj != null) {
            if (((BaseClass) obj).parentFolder != null) {
                parentPath(((BaseClass) obj).parentFolder);
                System.out.print("\\" + ((BaseClass) obj).name);
            } else if (((Disk) obj).letter != null) {
                System.out.print(((Disk) obj).letter + ":");
            }
        }
    }

}
