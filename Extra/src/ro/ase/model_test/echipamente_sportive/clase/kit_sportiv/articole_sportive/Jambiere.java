package ro.ase.model_test.echipamente_sportive.clase.kit_sportiv.articole_sportive;

public class Jambiere implements  IArticolSportiv{
    private String culoare;

    public Jambiere(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jambiere{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
