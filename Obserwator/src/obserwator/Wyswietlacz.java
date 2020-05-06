package obserwator;

public abstract class Wyswietlacz implements Observer {

    protected abstract void show(CzujnikTemperatury ct);

    @Override
    public void update(CzujnikTemperatury ct) {
        if (this.ct == ct) {
            show(ct);
        }
    }
    CzujnikTemperatury ct;
}
