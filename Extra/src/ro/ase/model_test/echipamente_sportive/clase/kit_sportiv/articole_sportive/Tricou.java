package ro.ase.model_test.echipamente_sportive.clase.kit_sportiv.articole_sportive;

public class Tricou implements  IArticolSportiv{
    private String culoare;

    public Tricou(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tricou{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
