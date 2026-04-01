package ro.ase.model_test.echipamente_sportive.clase;

public class Sportiv implements ISportiv{
    private String sport;
    private String marime;

    public Sportiv(String sport, String marime) {
        this.sport = sport;
        this.marime = marime;
    }

    @Override
    public String getSport() {
        return this.sport;
    }

    @Override
    public String getMarime() {
        return this.marime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sportiv{");
        sb.append("sport='").append(sport).append('\'');
        sb.append(", marime='").append(marime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
