package obserwator;

public class Obserwator {

    public static void main(String[] args) {
        CzujnikTemperatury ct = new CzujnikTemperatury();

        ct.add(new WyswietlaczCelcjusz(ct));
        ct.add(new WyswietlaczKelvin(ct));
        ct.add(new WyswietlaczFahrenheit(ct));

        //Temperatura podawana w Kelvinach
        ct.ustaw(0);
        System.out.println("");
        ct.ustaw(100);
        System.out.println("");
        ct.ustaw(420);
        System.out.println("");
        ct.ustaw(213.7);
    }

}
