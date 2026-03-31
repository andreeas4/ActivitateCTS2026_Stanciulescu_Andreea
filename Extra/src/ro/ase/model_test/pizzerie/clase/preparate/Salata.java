package ro.ase.model_test.pizzerie.clase.preparate;

public class Salata implements IPreparat{
    private String nume;
    private double timpGatire;
    private double pret;

    public Salata(String nume, double timpGatire, double pret) {
        this.nume = nume;
        this.timpGatire = timpGatire;
        this.pret = pret;
    }

    @Override
    public void gătire() {
        System.out.println("Se taie legumele se pun intr-un castron si se condimenteaza");
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
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", timpGatire=").append(timpGatire);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
