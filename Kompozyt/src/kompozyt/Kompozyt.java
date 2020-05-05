package kompozyt;

import java.util.Scanner;

public class Kompozyt {

    public static void main(String[] args) {

        Disk c = new Disk("System", "C");
        Folder f1 = new Folder("Nowy Folder(1)");
        f1.add(new File("Plik", "txt"));
        f1.add(new File("Plik", "bat"));
         
        c.add(new File("kapusta","jpg"));
        c.add(new File("kapusta2","jpg"));
        c.add(new File("kapusta3","jpg"));
        
        Folder f2 = new Folder("Praca Domowa");
        f2.add(new File("Matematyka", "mp4"));
        f2.add(new File("Jezyk Polski", "mp4"));
        f2.add(new File("W-F", "mp4"));

        Folder f3 = new Folder("Nowy Folder");
        f3.add(f1);
        f3.add(f2);

        Folder f4 = new Folder("Wazne pliki");
        f1.add(f4);
        
        Folder f5 = new Folder("MMMM");
        f5.add(new File("Buty","png"));
        f5.add(new File("Ziemniaki","png"));
        
        c.add(f3);
        c.add(f5);

        Scanner s = new Scanner(System.in);
        System.out.println("Dostępne polecenia:");
        System.out.println("-cd ..");
        System.out.println("-cd <nazwa katalogu>");
        System.out.println("-dir");
        System.out.println("-exit");
        System.out.println("");

        Folder currentFolder = c;


        String command = "";
        while (!command.equals("exit")) {
            currentFolder.displayPath();
            command = s.nextLine();
            if (command.equals("cd ..")) {
                if (currentFolder.parentFolder != null) {
                    currentFolder = currentFolder.parentFolder;
                }
            } else if (command.startsWith("cd ")) {
                if (currentFolder.cd(command.substring(3)) != null ) {
                    currentFolder = (Folder) currentFolder.cd(command.substring(3));
                }
            } else if (command.equals("dir")) {
                currentFolder.dir();
            }
        } 
    }

}
