package obserwator;

public class WyswietlaczCelcjusz extends Wyswietlacz {

    public WyswietlaczCelcjusz(CzujnikTemperatury ct) {
        this.ct = ct;
    }

    @Override
    protected void show(CzujnikTemperatury ct) {
        System.out.println(convertKelvinToCelsius(ct.getTemperatura()) + " stopni Celcjusza");
    }

    double convertKelvinToCelsius(double kelvin) {
        return (double) ((int) ((kelvin - 273.15) * 100)) / 100; // zaokraglenie w dol do drugiego miejsca po przecinku
    }

}
