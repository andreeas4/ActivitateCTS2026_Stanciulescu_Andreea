package ro.ase.cts.decoratorEx;

public class NotaDePlata implements NotaDePlataAbstracta{

    private Float suma;
    private String data;

    public NotaDePlata(Float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("Nota de plata : La data de " + this.data+ " a fost platita suma de "+suma);

    }
}
