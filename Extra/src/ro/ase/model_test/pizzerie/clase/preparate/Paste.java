package ro.ase.model_test.pizzerie.clase.preparate;

public class Paste implements IPreparat{
    private String nume;
    private double timpGatire;
    private double pret;

    public Paste(String nume, double timpGatire, double pret) {
        this.nume = nume;
        this.timpGatire = timpGatire;
        this.pret = pret;
    }

    @Override
    public void gătire() {
        System.out.println("Intai se fierb pastele dupa se adauga sosul");
    }

    @Override
    public String getDetalii() {
        return nume;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public boolean adaugaSos() {
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paste{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", timpGatire=").append(timpGatire);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
