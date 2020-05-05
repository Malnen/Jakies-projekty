package dekorator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dekorator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Wprowadz tekst: ");
        System.out.print(">> ");
        PlainText pt = new SimplePlainText(s.nextLine());
        
        System.out.println("Wybierz znacznik: ");
        System.out.println("1.<p>");
        System.out.println("2.<strong>");
        System.out.println("3.<em>");
        System.out.println("4.<mark>");
        System.out.println("5.<small>");
        System.out.println("6.Koniec");

        int choice = 0;
        do {
            while (!s.hasNextInt()) {
                s.next();
                System.out.println("Wprowadz cyfre.");
            }
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    pt = new PlainTextP(pt);
                    break;
                case 2:
                    pt = new PlainTextStrong(pt);
                    break;
                case 3:
                    pt = new PlainTextEm(pt);
                    break;
                case 4:
                    pt = new PlainTextMark(pt);
                    break;
                case 5:
                    pt = new PlainTextSmall(pt);
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);
        pt.write();
        System.out.println("");
    }
}
