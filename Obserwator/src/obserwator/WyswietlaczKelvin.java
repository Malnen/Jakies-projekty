package obserwator;

public class WyswietlaczKelvin extends Wyswietlacz {

    public WyswietlaczKelvin(CzujnikTemperatury ct) {
        this.ct = ct;
    }

    @Override
    protected void show(CzujnikTemperatury ct) {
        System.out.println(ct.getTemperatura() + " stopni Kelvina");
    }

}
