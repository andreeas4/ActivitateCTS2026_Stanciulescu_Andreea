package ro.ase.model_test.echipamente_sportive.clase.kit_sportiv.articole_sportive;

public class Sort implements IArticolSportiv{
    private String culoare;

    public Sort(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sort{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
