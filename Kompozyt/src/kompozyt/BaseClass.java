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
}
