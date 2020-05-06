package fabryka;

import java.util.Scanner;

public class Fabryka {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Wprowadz tekst");
        System.out.print(">>");
        PlainText pt = new SimplePlainText(s.nextLine());
        System.out.println("Wybierz znacznik");
        System.out.println("1.p");
        System.out.println("2.em");
        System.out.println("3.mark");
        System.out.println("4.small");
        System.out.println("5.strong");

        int choice = 0;
        while (!s.hasNextInt()) {
            s.next();
        }
        choice = s.nextInt();
        String type = "";
        switch (choice) {
            case 1:
                type = "p";
                break;
            case 2:
                type = "em";
                break;
            case 3:
                type = "mark";
                break;
            case 4:
                type = "small";
                break;
            case 5:
                type = "strong";
                break;
        }
        PlainTextFactory.createPlainText(pt, type).print();
    }

}
