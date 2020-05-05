package kompozyt;

import java.util.ArrayList;

public class Folder extends BaseClass {

    public Folder(String name) {
        super(name, "<DIR>");
    }

    public void add(BaseClass e) {
        array.add(e);
        e.parentFolder = this;
    }
    ArrayList<BaseClass> array = new ArrayList();

    @Override
    public void dir() {
        for (BaseClass b : array) {
            System.out.print("  " + b.name);
            if (!b.type.equals("<DIR>")) {
                System.out.print(".");
            }
            System.out.println(b.type);
        }
    }

    public void displayPath() {
        parentPath(this);
        System.out.print(">");
    }

    void parentPath(Folder folder) {
        if (folder.parentFolder != null) {
            parentPath(folder.parentFolder);
            System.out.print("\\" + folder.name);
        } else {
            System.out.print(((Disk) folder).letter + ":");
        }
    }

    public Folder cd() {
        return parentFolder;
    }

    public BaseClass cd(String name) {
        BaseClass bc = null;
        for (BaseClass b : array) {
            if (b.type.equals("<DIR>")) {
                if (b.name.toLowerCase().equals(name.toLowerCase())) {
                    bc = b;
                }
            }
        }
        if (bc == null) {
            System.out.println("Nie odnaleziono folderu.");
        }
        return bc;
    }
}
