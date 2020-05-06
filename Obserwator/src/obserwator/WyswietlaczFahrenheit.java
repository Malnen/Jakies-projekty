package obserwator;

public class WyswietlaczFahrenheit extends Wyswietlacz {

    public WyswietlaczFahrenheit(CzujnikTemperatury ct) {
        this.ct = ct;
    }

    @Override
    protected void show(CzujnikTemperatury ct) {
        System.out.println(convertKelvinToFahrenheit(ct.getTemperatura()) + " stopni Fahrenheit'a");
    }

    double convertKelvinToFahrenheit(double kelvin) {
        return (double) ((int) ((kelvin * 9 / 5 - 459.67) * 100)) / 100;  // zaokraglenie w dol do drugiego miejsca po przecinku
    }
}
