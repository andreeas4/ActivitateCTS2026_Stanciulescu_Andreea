package ro.ase.model_test.pizzerie.clase.preparate;

public class Pizza implements IPreparat{
    private String nume;
    private double timpGatire;
    private double pret;

    public Pizza(String nume, double timpGatire, double pret) {
        this.nume = nume;
        this.timpGatire = timpGatire;
        this.pret = pret;
    }

    @Override
    public void gătire() {
        System.out.println("Se pregateste blatul de baga la cuptor apoi se pun cascavalul si sosul si extra toppings");
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
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", timpGatire=").append(timpGatire);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
